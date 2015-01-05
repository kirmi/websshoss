package com.shinowit.web;

import com.shinowit.dao.mapper.ShengMapper;
import com.shinowit.dao.mapper.ShiMapper;
import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class Chart01Controller {
    @Resource
    private TbaMembeaddrinfoMapper dao;
    @Resource
    private ShengMapper shengdao;
    @Resource
    private ShiMapper shidao;

    @RequestMapping("/chart01")
    public String chartshow(@ModelAttribute("dizhibaocun") TbaMembeaddrinfo tbaMembeaddrinfo, Model model, HttpServletRequest request) {
        //查数据库中存在的信息
        try {
            String sess = (String) request.getSession().getAttribute("loginsession");
            TbaMembeaddrinfoCriteria criteria = new TbaMembeaddrinfoCriteria();
            TbaMembeaddrinfoCriteria.Criteria addressshow = criteria.createCriteria();
            addressshow.andUsernameEqualTo(sess);
            List<TbaMembeaddrinfo> listadder = dao.selectByExample(criteria);
            model.addAttribute("showaddress", listadder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //添加新的信息
        try {
            //下拉列表省份
            ShengCriteria criteria = new ShengCriteria();
            ShengCriteria.Criteria she = criteria.createCriteria();
            she.andShengidIsNotNull();
            List<Sheng> listsheng = shengdao.selectByExample(criteria);
            model.addAttribute("shengshow", listsheng);
            //市级根据省份查询
            String shengfen=request.getParameter("items");
            ShiCriteria criteria1=new ShiCriteria();
            ShiCriteria.Criteria shiselectinfo=criteria1.createCriteria();
                int i=Integer.valueOf(shengfen).intValue();
            shiselectinfo.andShengidEqualTo(i);
            List<Shi> listshi=shidao.selectByExample(criteria1);
            model.addAttribute("shishowlists",listshi);
//            //保存收货信息
//            String currentaddress = (String) request.getSession().getAttribute("loginsession");
//            tbaMembeaddrinfo.setUsername(currentaddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/chart01";
    }

}
