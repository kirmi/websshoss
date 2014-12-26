package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2014/12/26.
 */
@Controller
@RequestMapping("/test")
public class TestFormController {
    @RequestMapping("/form")
    public void test(HttpServletRequest request,HttpServletResponse response){
        String name = (String)request.getParameter("username");
        try {
            response.getWriter().println("提交成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
