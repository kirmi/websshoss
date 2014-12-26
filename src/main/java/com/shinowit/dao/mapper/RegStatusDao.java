package com.shinowit.dao.mapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.Type;
import java.sql.Types;

/**
 * Created by Administrator on 2014/12/26.
 */
@Repository
public class RegStatusDao {

    @Resource
    private JdbcTemplate jt;
    public boolean regstatusinsert(String name,boolean status){
        boolean result = false;
        String sql = "update dbo.TBa_MemberInfo set Status=? where UserName=?";
        int a = jt.update(sql,new Object[]{status,name},new int[]{Types.BOOLEAN,Types.VARCHAR});
        if(a>0){
            result = true;
        }
        return result;
    }

}
