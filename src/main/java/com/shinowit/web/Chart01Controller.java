package com.shinowit.web;

import com.shinowit.dao.mapper.QuMapper;
import com.shinowit.dao.mapper.ShengMapper;
import com.shinowit.dao.mapper.ShiMapper;
import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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

    @Resource
    private QuMapper qudao;

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
        return "/chart01";
    }

    @RequestMapping("/insertxinxi")
    public String charaddinsert(@ModelAttribute("dizhireg")TbaMembeaddrinfo tbaMembeaddrinfo){
        dao.insert(tbaMembeaddrinfo);
        return "/chart01";
    }
    //省的查询
    @RequestMapping("/province")
    @ResponseBody
    public List<Sheng> province1(){
        ShengCriteria criteria = new ShengCriteria();
        ShengCriteria.Criteria she = criteria.createCriteria();
        she.andShengidIsNotNull();
        List<Sheng> listsheng = shengdao.selectByExample(criteria);
        return listsheng;
    }
    //市的查询
    @RequestMapping("/city")
    @ResponseBody
    public List<Shi>  city1( HttpServletRequest request){
        String shengfen=request.getParameter("provinceid");
        ShiCriteria criteria1=new ShiCriteria();
        ShiCriteria.Criteria shiselectinfo=criteria1.createCriteria();
        int i=Integer.valueOf(shengfen).intValue();
        shiselectinfo.andShengidEqualTo(i);
        List<Shi> listshi=shidao.selectByExample(criteria1);
        return listshi;
    }
    //区县的查询
    @RequestMapping("county")
    @ResponseBody
    public List<Qu> contry1(HttpServletRequest request){
        String shiidselect=request.getParameter("cityid");
        int s=Integer.valueOf(shiidselect).intValue();
        QuCriteria criteria=new QuCriteria();
        QuCriteria.Criteria qulist=criteria.createCriteria();
        qulist.andShiidEqualTo(s);
        List<Qu> shouqu=qudao.selectByExample(criteria);
        return shouqu;
    }
}
