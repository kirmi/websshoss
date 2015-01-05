package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class InnerPageController {
    @RequestMapping("/innerpage")
    public String chartshow(Model model,HttpServletRequest request){
        String name=request.getParameter("goodsname");
        String price=request.getParameter("goodsprice");
        String tupian=request.getParameter("shangpintupian");
        try {
            byte[] bb = name.getBytes("ISO-8859-1");
            name=new String(bb,"UTF-8");
            model.addAttribute("names",name);
            model.addAttribute("prices",price);
            model.addAttribute("showtupian",tupian);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return "/innerpage";
    }
}
