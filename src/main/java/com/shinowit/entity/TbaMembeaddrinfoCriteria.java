package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class TbaMembeaddrinfoCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public TbaMembeaddrinfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setCustomCriteria(String customCriteria) {
        this.customCriteria=customCriteria;
    }

    public String getCustomCriteria() {
        return this.customCriteria;
    }

    public int getSkipRecordCount() {
        int count=(this.pageIndex-1)*this.pageSize;
        if (count<0){
             count=0;
        }
        return count;
    }

    public int getEndRecordCount() {
        return this.pageIndex*this.pageSize;
    }

    public TbaMembeaddrinfoCriteria(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("IsDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("IsDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Boolean value) {
            addCriterion("IsDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Boolean value) {
            addCriterion("IsDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Boolean value) {
            addCriterion("IsDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Boolean value) {
            addCriterion("IsDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Boolean> values) {
            addCriterion("IsDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Boolean> values) {
            addCriterion("IsDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault not between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("PostCode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("PostCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("PostCode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("PostCode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("PostCode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PostCode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("PostCode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("PostCode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("PostCode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("PostCode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("PostCode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("PostCode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("PostCode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("PostCode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andRecaddressIsNull() {
            addCriterion("RecAddress is null");
            return (Criteria) this;
        }

        public Criteria andRecaddressIsNotNull() {
            addCriterion("RecAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRecaddressEqualTo(String value) {
            addCriterion("RecAddress =", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressNotEqualTo(String value) {
            addCriterion("RecAddress <>", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressGreaterThan(String value) {
            addCriterion("RecAddress >", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressGreaterThanOrEqualTo(String value) {
            addCriterion("RecAddress >=", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressLessThan(String value) {
            addCriterion("RecAddress <", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressLessThanOrEqualTo(String value) {
            addCriterion("RecAddress <=", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressLike(String value) {
            addCriterion("RecAddress like", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressNotLike(String value) {
            addCriterion("RecAddress not like", value, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressIn(List<String> values) {
            addCriterion("RecAddress in", values, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressNotIn(List<String> values) {
            addCriterion("RecAddress not in", values, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressBetween(String value1, String value2) {
            addCriterion("RecAddress between", value1, value2, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecaddressNotBetween(String value1, String value2) {
            addCriterion("RecAddress not between", value1, value2, "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecmanIsNull() {
            addCriterion("RecMan is null");
            return (Criteria) this;
        }

        public Criteria andRecmanIsNotNull() {
            addCriterion("RecMan is not null");
            return (Criteria) this;
        }

        public Criteria andRecmanEqualTo(String value) {
            addCriterion("RecMan =", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanNotEqualTo(String value) {
            addCriterion("RecMan <>", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanGreaterThan(String value) {
            addCriterion("RecMan >", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanGreaterThanOrEqualTo(String value) {
            addCriterion("RecMan >=", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanLessThan(String value) {
            addCriterion("RecMan <", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanLessThanOrEqualTo(String value) {
            addCriterion("RecMan <=", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanLike(String value) {
            addCriterion("RecMan like", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanNotLike(String value) {
            addCriterion("RecMan not like", value, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanIn(List<String> values) {
            addCriterion("RecMan in", values, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanNotIn(List<String> values) {
            addCriterion("RecMan not in", values, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanBetween(String value1, String value2) {
            addCriterion("RecMan between", value1, value2, "recman");
            return (Criteria) this;
        }

        public Criteria andRecmanNotBetween(String value1, String value2) {
            addCriterion("RecMan not between", value1, value2, "recman");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIsNull() {
            addCriterion("MerchandiseID is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIsNotNull() {
            addCriterion("MerchandiseID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidEqualTo(String value) {
            addCriterion("MerchandiseID =", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotEqualTo(String value) {
            addCriterion("MerchandiseID <>", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThan(String value) {
            addCriterion("MerchandiseID >", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseID >=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThan(String value) {
            addCriterion("MerchandiseID <", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseID <=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLike(String value) {
            addCriterion("MerchandiseID like", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotLike(String value) {
            addCriterion("MerchandiseID not like", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIn(List<String> values) {
            addCriterion("MerchandiseID in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotIn(List<String> values) {
            addCriterion("MerchandiseID not in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidBetween(String value1, String value2) {
            addCriterion("MerchandiseID between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotBetween(String value1, String value2) {
            addCriterion("MerchandiseID not between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andPostcodeLikeInsensitive(String value) {
            addCriterion("upper(PostCode) like", value.toUpperCase(), "postcode");
            return (Criteria) this;
        }

        public Criteria andRecaddressLikeInsensitive(String value) {
            addCriterion("upper(RecAddress) like", value.toUpperCase(), "recaddress");
            return (Criteria) this;
        }

        public Criteria andRecmanLikeInsensitive(String value) {
            addCriterion("upper(RecMan) like", value.toUpperCase(), "recman");
            return (Criteria) this;
        }

        public Criteria andTelLikeInsensitive(String value) {
            addCriterion("upper(Tel) like", value.toUpperCase(), "tel");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(UserName) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLikeInsensitive(String value) {
            addCriterion("upper(MerchandiseID) like", value.toUpperCase(), "merchandiseid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 04 23:42:59 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Sun Jan 04 23:42:59 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}