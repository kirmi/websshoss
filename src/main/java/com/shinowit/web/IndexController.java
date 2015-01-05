package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class IndexController {
    @Resource
    private TmeMerchandisecinfoMapper dao;
    @Resource
    private TmeMerchandiseinfoMapper classdao;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String indexshow(@RequestParam(value = "shang",required = false)String shangyiye, @RequestParam(value = "merclassidlistmany",required = false) String sslis,@RequestParam(value = "clickcount",required = false)Integer click ,Model model,HttpServletRequest request){
//商品类别信息展示
        TmeMerchandisecinfoCriteria criteria=new TmeMerchandisecinfoCriteria();
        TmeMerchandisecinfoCriteria.Criteria show=criteria.createCriteria();
        show.andMerchandisecidIsNotNull();
        List<TmeMerchandisecinfo>  listshow=dao.selectByExample(criteria);
        model.addAttribute("index_show",listshow);
        model.addAttribute("nnsdds",click);
        model.addAttribute("mijhd",sslis);
//商品详细信息查询
        TmeMerchandiseinfoCriteria criteria1=new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria llshow=criteria1.createCriteria();
        if(sslis==null){
            llshow.andMerchandisecidIsNotNull();
            List<TmeMerchandiseinfo> nointalist= classdao.selectByExample(criteria1);
            try {
                nointalist = classdao.selectByExample(criteria1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            model.addAttribute("detalist",nointalist);
        }else{
            llshow.andMerchandisecidEqualTo(sslis);
            List<TmeMerchandiseinfo> intalist= classdao.selectByExample(criteria1);
            try {
                intalist = classdao.selectByExample(criteria1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            model.addAttribute("detalist",intalist);
        }
//分页信息查询显示
        TmeMerchandiseinfoCriteria quer=new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria querch=quer.createCriteria();
        int PageSize=4;
        int PageIndex=1;
        if(shangyiye==null){
            quer.setPageSize(PageSize);
            quer.setPageIndex(PageIndex);
            if(click==null){

                querch.andClickcountIsNotNull();
                try {
                    List<TmeMerchandiseinfo> listquery= classdao.selectPage(quer);
                    model.addAttribute("show_page",listquery);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                querch.andClickcountEqualTo(click);
                try {
                    List<TmeMerchandiseinfo> listquery= classdao.selectPage(quer);
                    model.addAttribute("show_page",listquery);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //查询总页数
            int countlistzongshu=classdao.countByExample(quer);
            if(countlistzongshu%PageSize>0){
                int cuountsize=(countlistzongshu/PageSize)+1;
                //总页数
                model.addAttribute  ("zongyeshu",cuountsize);
            }if(countlistzongshu%PageSize==0){
                int cuountlll=countlistzongshu/PageSize;
                model.addAttribute("zongyeshu",cuountlll);
            }
            //总数
            //model.addAttribute("zongshu",countlistzongshu);
            //当前页
            model.addAttribute("current",PageIndex);
        }else{
            int i = Integer.valueOf(shangyiye).intValue();//将值转换成int类型
            quer.setPageSize(PageSize);
            quer.setPageIndex(i);
            //当前页
            model.addAttribute("current", i);
            querch.andClickcountIsNotNull();
            int countlistzongshu=classdao.countByExample(quer);
            //商品总数
            model.addAttribute("zongshu",countlistzongshu);
            if(click==null){
                querch.andClickcountIsNotNull();
                try {
                    List<TmeMerchandiseinfo> listquery= classdao.selectPage(quer);
                    model.addAttribute("show_page",listquery);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int cuontl=classdao.countByExample(quer);
                if(cuontl%PageSize>0){
                    int cuountsize=(countlistzongshu/PageSize)+1;
                    //总页数
                    model.addAttribute("zongyeshu",cuountsize);
                }if(countlistzongshu%PageSize==0){
                    int cuountlll=countlistzongshu/PageSize;
                    model.addAttribute("zongyeshu",cuountlll);
                }

            }else{
                if(click!=null){
                    int cuontl=classdao.countByExample(quer);
                    if(cuontl%PageSize>0){
                        int cuountsize=(countlistzongshu/PageSize)+1;
                        //总页数
                        model.addAttribute("zongyeshu",cuountsize);
                    }if(countlistzongshu%PageSize==0){
                        int cuountlll=countlistzongshu/PageSize;
                        model.addAttribute("zongyeshu",cuountlll);
                    }
                    try {
                        querch.andClickcountEqualTo(click);
                        List<TmeMerchandiseinfo> listqueryf= classdao.selectPage(quer);
                        model.addAttribute("show_page",listqueryf);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }

        return "/index";
    }
}
