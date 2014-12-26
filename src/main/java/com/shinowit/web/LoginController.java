package com.shinowit.web;

import com.shinowit.dao.mapper.ToolsDao;
import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class LoginController {

    @Resource
    private TbaMemberinfoMapper memberinfoMapper;

    @Resource
    private ToolsDao dao;

    @RequestMapping("/login")
    public String loginshow(){
        return "/login";
    }

    @RequestMapping("/loginemail")
    public void testemail(@RequestParam("valid") String emailvalue,HttpServletResponse response){
            List<Map<String,Object>> memberlist = dao.selectstatus(emailvalue);
            if(memberlist.size()<1){
                try {
                    response.getWriter().println("邮箱不存在或者还没有激活!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}