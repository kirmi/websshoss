package com.shinowit.web;

import com.shinowit.tools.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/test")
public class TestRegController {

    @Resource
    private SendHtmlMail sendHtmlMail;

    @RequestMapping("/reg")
    public void show(@RequestParam("username") String regname,@RequestParam("userpass") String regpass,@RequestParam("emailurl") String addressemail,HttpServletRequest request){

        String session = request.getSession().getId();

        String smtpserver = "<请将此地址复制到地址栏里面进行最后的确认>http://localhost:8080/test/valid?validString="+session+"";

        try {
            sendHtmlMail.sendMessage(addressemail,"用户激活",smtpserver);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("valid")
    public void show1(@RequestParam("validString") String validString){
        System.out.println(validString);
    }

}
