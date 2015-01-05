package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.TbaMembeaddrinfo;
import com.shinowit.entity.TbaMembeaddrinfoCriteria;
import com.shinowit.entity.TbaMemberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class Chart01Controller {
    @Resource
    private TbaMembeaddrinfoMapper dao;
    @RequestMapping("/chart01")
    public String chartshow(Model model,HttpServletRequest request){
        try {
            String sess=(String)request.getSession().getAttribute("loginsession");
            TbaMembeaddrinfoCriteria criteria=new TbaMembeaddrinfoCriteria();
            TbaMembeaddrinfoCriteria.Criteria addressshow=criteria.createCriteria();
            addressshow.andUsernameEqualTo(sess);
            List<TbaMembeaddrinfo> listadder=dao.selectByExample(criteria);
            model.addAttribute("showaddress",listadder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/chart01";
    }
}
