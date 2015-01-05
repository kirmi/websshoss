package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbaMemberinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.UserName
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.ActiveDate
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private Date activedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.Balance
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private BigDecimal balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.Email
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.ID
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.lName
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private String lname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.Pwd
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.RegDate
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private Date regdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.Remark
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBa_MemberInfo.Status
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_MemberInfo
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.UserName
     *
     * @return the value of TBa_MemberInfo.UserName
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.UserName
     *
     * @param username the value for TBa_MemberInfo.UserName
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.ActiveDate
     *
     * @return the value of TBa_MemberInfo.ActiveDate
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public Date getActivedate() {
        return activedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.ActiveDate
     *
     * @param activedate the value for TBa_MemberInfo.ActiveDate
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setActivedate(Date activedate) {
        this.activedate = activedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.Balance
     *
     * @return the value of TBa_MemberInfo.Balance
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.Balance
     *
     * @param balance the value for TBa_MemberInfo.Balance
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.Email
     *
     * @return the value of TBa_MemberInfo.Email
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.Email
     *
     * @param email the value for TBa_MemberInfo.Email
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.ID
     *
     * @return the value of TBa_MemberInfo.ID
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.ID
     *
     * @param id the value for TBa_MemberInfo.ID
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.lName
     *
     * @return the value of TBa_MemberInfo.lName
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public String getLname() {
        return lname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.lName
     *
     * @param lname the value for TBa_MemberInfo.lName
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.Pwd
     *
     * @return the value of TBa_MemberInfo.Pwd
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.Pwd
     *
     * @param pwd the value for TBa_MemberInfo.Pwd
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.RegDate
     *
     * @return the value of TBa_MemberInfo.RegDate
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public Date getRegdate() {
        return regdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.RegDate
     *
     * @param regdate the value for TBa_MemberInfo.RegDate
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.Remark
     *
     * @return the value of TBa_MemberInfo.Remark
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.Remark
     *
     * @param remark the value for TBa_MemberInfo.Remark
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBa_MemberInfo.Status
     *
     * @return the value of TBa_MemberInfo.Status
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBa_MemberInfo.Status
     *
     * @param status the value for TBa_MemberInfo.Status
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MemberInfo
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbaMemberinfo other = (TbaMemberinfo) that;
        return (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getActivedate() == null ? other.getActivedate() == null : this.getActivedate().equals(other.getActivedate()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLname() == null ? other.getLname() == null : this.getLname().equals(other.getLname()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getRegdate() == null ? other.getRegdate() == null : this.getRegdate().equals(other.getRegdate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MemberInfo
     *
     * @mbggenerated Mon Jan 05 18:42:52 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getActivedate() == null) ? 0 : getActivedate().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLname() == null) ? 0 : getLname().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getRegdate() == null) ? 0 : getRegdate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}