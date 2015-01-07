package com.shinowit.web;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.chart.Chart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/7.
 */
@Controller
public class CartijiaoController {
    //将数据添加到jession的文件中
    @RequestMapping("/sdedf")
    public void showgodds(String jsonData,HttpServletRequest request){
        String s2 = new String(jsonData);
        if (s2.length()>0){
            request.getSession().setAttribute("dangqiangouwuche",s2);
        }
    }
}
