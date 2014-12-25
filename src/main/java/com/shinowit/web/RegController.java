package com.shinowit.web;

import com.shinowit.tools.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
public class RegController {


    @RequestMapping("reg")
    public String regshow(){
        return "/reg";
    }




}
