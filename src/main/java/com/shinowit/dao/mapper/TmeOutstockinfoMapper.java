package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeOutstockinfo;
import com.shinowit.entity.TmeOutstockinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeOutstockinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int countByExample(TmeOutstockinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int deleteByExample(TmeOutstockinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int deleteByPrimaryKey(String outbillcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int insert(TmeOutstockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int insertSelective(TmeOutstockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    List<TmeOutstockinfo> selectByExample(TmeOutstockinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    TmeOutstockinfo selectByPrimaryKey(String outbillcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeOutstockinfo record, @Param("example") TmeOutstockinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int updateByExample(@Param("record") TmeOutstockinfo record, @Param("example") TmeOutstockinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int updateByPrimaryKeySelective(TmeOutstockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 10:26:01 CST 2015
     */
    int updateByPrimaryKey(TmeOutstockinfo record);

    List<TmeOutstockinfo> selectPage(TmeOutstockinfoCriteria example);

    String selectMaxPrimaryKeyValue();
}