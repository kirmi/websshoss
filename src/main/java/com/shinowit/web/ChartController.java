package com.shinowit.web;

import com.shinowit.dao.mapper.TauGowucheMapper;
import com.shinowit.entity.TauGowuche;
import com.shinowit.entity.TauGowucheCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class ChartController {
    @Resource
    private TauGowucheMapper dao;

    @RequestMapping("/chart")
    public String chartshow(HttpServletRequest request,Model model){
        String name=request.getParameter("goodsname");
        String tupian=request.getParameter("tupianxinxi");
        String jiage=request.getParameter("jiage");
        String currentuser=(String)request.getSession().getAttribute("loginsession");
        if(jiage!=null){
            try {
                byte[] bb = name.getBytes("ISO-8859-1");
                name=new String(bb,"UTF-8");
                TauGowuche gowuche=new TauGowuche();
                gowuche.setName(name);
                gowuche.setPth(tupian);
                gowuche.setPrice(jiage);
                gowuche.setUsername(currentuser);
                dao.insert(gowuche);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return "redirect:/shinowit/index";
        }else{
            String username=request.getParameter("logname");
            if(username!=null){
                TauGowucheCriteria criteria=new TauGowucheCriteria();
                TauGowucheCriteria.Criteria gouwu=criteria.createCriteria();
                gouwu.andUsernameEqualTo(username);
                int pageIndex=1;
                int pageSize=3;
                criteria.setPageIndex(pageIndex);
                criteria.setPageSize(pageSize);
                try {
                    List<TauGowuche> listgouwu=dao.selectPage(criteria);
                    int countlist=dao.countByExample(criteria);
                    model.addAttribute("zhongshu",countlist);
                    model.addAttribute("listshow",listgouwu);
                    model.addAttribute("liname",username);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return "/chart";
        }
    }

    //单条删除
    @RequestMapping(value = "/del")
    public String delect(HttpServletRequest request){
        String id=request.getParameter("shangpinid");
        String username=request.getParameter("userid");
        if(id!=null){
            int i=Integer.valueOf(id).intValue();
            dao.deleteByPrimaryKey(i);
        }
        return "redirect:/shinowit/chart?logname="+username;
    }
    //清空购物车
    @RequestMapping(value = "delall")
    public String delall(HttpServletRequest request){
        String delcurrent=(String)request.getSession().getAttribute("loginsession");
        TauGowucheCriteria criteria=new TauGowucheCriteria();
        TauGowucheCriteria.Criteria delall=criteria.createCriteria();
        delall.andUsernameEqualTo(delcurrent);
        dao.deleteByExample(criteria);
        return "redirect:/shinowit/chart?logname="+delcurrent;
    }
}
