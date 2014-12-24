package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class InnerPageController {
    @RequestMapping("/innerpage")
    public String chartshow(){
        return "/innerpage";
    }
}
