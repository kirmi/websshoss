package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeMerchandiseinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int countByExample(TmeMerchandiseinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int deleteByExample(TmeMerchandiseinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int deleteByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int insert(TmeMerchandiseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int insertSelective(TmeMerchandiseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    List<TmeMerchandiseinfo> selectByExample(TmeMerchandiseinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    TmeMerchandiseinfo selectByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeMerchandiseinfo record, @Param("example") TmeMerchandiseinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int updateByExample(@Param("record") TmeMerchandiseinfo record, @Param("example") TmeMerchandiseinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int updateByPrimaryKeySelective(TmeMerchandiseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    int updateByPrimaryKey(TmeMerchandiseinfo record);

    List<TmeMerchandiseinfo> selectPage(TmeMerchandiseinfoCriteria example);

    String selectMaxPrimaryKeyValue();
}