package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import com.shinowit.tools.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.regex.*;

@Controller
public class RegController {

    @Resource
    private TbaMemberinfoMapper memdao;

    @Resource
    private SendHtmlMail htmlMail;

//    @Resource
//    private RemarkInsertDao remarkInsertDao;

    @RequestMapping("/emailvalid")//邮箱是否已存在
    public void emailvalid(@RequestParam("email") String emaildata,HttpServletResponse response){
        TbaMemberinfoCriteria criteria = new TbaMemberinfoCriteria();
        TbaMemberinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andEmailEqualTo(emaildata);
        List<TbaMemberinfo> memelist = memdao.selectByExample(criteria);
        if(memelist.size()>0){
            try {
                response.getWriter().println("邮箱已存在，请直接用该邮箱登录");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            try {
                response.getWriter().println("√");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @RequestMapping("/validate")//验证码jquery
    public void validate(@RequestParam("checkvalue") String checkvalue,HttpServletRequest request,HttpServletResponse response){
        String realchecknum = (String)request.getSession().getAttribute("rand");
        if(!checkvalue.equals(realchecknum)){
            try {
                response.getWriter().println("验证码输入错误");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //真正插入数据库的语句
    @RequestMapping("/insert")//插入数据库+发送邮箱激活
    public String reginsert(@ModelAttribute("memeber") TbaMemberinfo memberinfo,BindingResult bindingResult,HttpServletRequest request){
        if(bindingResult.hasErrors()){
            return "/reg";
        }
        if(memberinfo.getEmail()==null){
            return "/reg";
        }
        //设定的email的格式是什么
        String regex="^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(memberinfo.getEmail());
        boolean result = m.find();
        //以上是邮箱的验证
        if(result==false){
            request.setAttribute("email","请输入正确的邮箱");
            return "/reg";
        }
        if((memberinfo.getUsername()==null)||(memberinfo.getUsername().trim().length()<1)){
            request.setAttribute("username","昵称不能为空");
            return "/reg";
        }
        if((memberinfo.getPwd()==null)||(memberinfo.getPwd().trim().length()<1)){
            request.setAttribute("pwd","密码不能为空");
            return "/reg";
        }
        //获取session的id值
        String sessioncode = request.getSession().getId();
        //memberinfo.setRemark(sessioncode);
        int a = memdao.insert(memberinfo);
        String smtpserver = "点击激活账号：http://10.2.25.199:8080/jihuoemail1/"+sessioncode+"";
        try {
            htmlMail.sendMessage(memberinfo.getEmail(),"用户注册",smtpserver);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if(a>0){
            request.setAttribute("success","请到邮箱激活验证码!");
            return "/reg";
        }
        return "/reg";
    }
    @RequestMapping("/jihuoemail1/{validString}")//用reset的风格激活判断并附加状态
    public String validemail1(@ModelAttribute("memeber") TbaMemberinfo memberinfo,@PathVariable("validString") String validsessioncode,HttpServletRequest request){
        TbaMemberinfo member = new TbaMemberinfo();
        member.setRemark(validsessioncode);
        TbaMemberinfoCriteria criteria = new TbaMemberinfoCriteria();
        TbaMemberinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andRemarkEqualTo(validsessioncode);
        List<TbaMemberinfo> result = memdao.selectByExample(criteria);
        String name1 = null;
        for(TbaMemberinfo mer : result){
            name1 = mer.getUsername();
        }
        if(result.size()<0){
//            remarkInsertDao.updateremark(name1);
            return "redirect:/shinowit/validlogin";
        }else{
            request.setAttribute("success","注册失败，请重新填写");
            return "/reg";
        }
    }

}
