package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
public class RegController {

    @Resource
    private TbaMemberinfoMapper memdao;

    @RequestMapping("/reg")
    public String regshow(){
        return "/reg";
    }

    @RequestMapping("/emailvalid")
    public void emailvalid(@RequestParam("email") String emaildata,HttpServletResponse response){
        TbaMemberinfoCriteria criteria = new TbaMemberinfoCriteria();
        TbaMemberinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andEmailEqualTo(emaildata);
        List<TbaMemberinfo> memelist = memdao.selectByExample(criteria);
        if(memelist.size()>0){
            try {
                response.getWriter().println("注册失败");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            try {
                response.getWriter().println("注册成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @RequestMapping("/insert")
    public String reginsert(@ModelAttribute("memeber") TbaMemberinfo memberinfo,BindingResult bindingResult){
        return "/reg";
    }
}
