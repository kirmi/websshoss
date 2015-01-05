package com.shinowit.web;
import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class LoginController {
    @Resource
    private TbaMemberinfoMapper memberdao;

    @RequestMapping("/validlogin")
    public String testlogin(@ModelAttribute("loginmem")TbaMemberinfo memebr,BindingResult bindingResult,HttpServletRequest request,Model model){
        if(bindingResult.hasErrors()){
            return "/login";
        }
        if((memebr.getUsername()==null)||(memebr.getUsername().trim().length()<1)){
            request.setAttribute("username","用户名不能为空");
            return "/login";
        }
        if((memebr.getPwd()==null)||(memebr.getPwd().length()<1)){
            request.setAttribute("username","密码不能为空");
            return "/login";
        }
        TbaMemberinfoCriteria criteria=new TbaMemberinfoCriteria();
        TbaMemberinfoCriteria.Criteria checkinfo=criteria.createCriteria();
        List<TbaMemberinfo> infocheck=memberdao.selectByExample(criteria);
        for (TbaMemberinfo sho:infocheck){
            if(sho.getRemark()==null){
                request.setAttribute("username","账户未被激活请重新激活");
            }else{
                if((memebr.getUsername().equals(sho.getUsername()))&&(memebr.getPwd().equals(sho.getPwd()))&&(sho.getRemark()!=null)){
                    String Loginname=sho.getUsername();
                    request.getSession().setAttribute("loginsession",Loginname);
                    return"redirect:/shinowit/index";
                }
            }
        }
        return "/login";
    }
}