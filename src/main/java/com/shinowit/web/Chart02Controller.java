package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.TbaMembeaddrinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class Chart02Controller {
    @Resource
    private TbaMembeaddrinfoMapper dao;
    @RequestMapping("/chart02")
    public String chartshow(Model model,@RequestParam(value = "addid",required = false)Integer adid){
        TbaMembeaddrinfo ss=dao.selectByPrimaryKey(adid);
        model.addAttribute("gtess",ss);
        return "/chart02";
    }
}
