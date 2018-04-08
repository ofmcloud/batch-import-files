package com.onfacemind.batchimportfiles.write.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNull() {
            addCriterion("valid_period is null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNotNull() {
            addCriterion("valid_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodEqualTo(String value) {
            addCriterion("valid_period =", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotEqualTo(String value) {
            addCriterion("valid_period <>", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThan(String value) {
            addCriterion("valid_period >", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("valid_period >=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThan(String value) {
            addCriterion("valid_period <", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThanOrEqualTo(String value) {
            addCriterion("valid_period <=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLike(String value) {
            addCriterion("valid_period like", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotLike(String value) {
            addCriterion("valid_period not like", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIn(List<String> values) {
            addCriterion("valid_period in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotIn(List<String> values) {
            addCriterion("valid_period not in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodBetween(String value1, String value2) {
            addCriterion("valid_period between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotBetween(String value1, String value2) {
            addCriterion("valid_period not between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEthnicityIsNull() {
            addCriterion("ethnicity is null");
            return (Criteria) this;
        }

        public Criteria andEthnicityIsNotNull() {
            addCriterion("ethnicity is not null");
            return (Criteria) this;
        }

        public Criteria andEthnicityEqualTo(String value) {
            addCriterion("ethnicity =", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotEqualTo(String value) {
            addCriterion("ethnicity <>", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityGreaterThan(String value) {
            addCriterion("ethnicity >", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityGreaterThanOrEqualTo(String value) {
            addCriterion("ethnicity >=", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLessThan(String value) {
            addCriterion("ethnicity <", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLessThanOrEqualTo(String value) {
            addCriterion("ethnicity <=", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLike(String value) {
            addCriterion("ethnicity like", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotLike(String value) {
            addCriterion("ethnicity not like", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityIn(List<String> values) {
            addCriterion("ethnicity in", values, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotIn(List<String> values) {
            addCriterion("ethnicity not in", values, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityBetween(String value1, String value2) {
            addCriterion("ethnicity between", value1, value2, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotBetween(String value1, String value2) {
            addCriterion("ethnicity not between", value1, value2, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("date_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("date_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("date_of_birth >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(Date value) {
            addCriterionForJDBCDate("date_of_birth <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth not between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andTempIdIsNull() {
            addCriterion("temp_id is null");
            return (Criteria) this;
        }

        public Criteria andTempIdIsNotNull() {
            addCriterion("temp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTempIdEqualTo(String value) {
            addCriterion("temp_id =", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotEqualTo(String value) {
            addCriterion("temp_id <>", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThan(String value) {
            addCriterion("temp_id >", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_id >=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThan(String value) {
            addCriterion("temp_id <", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThanOrEqualTo(String value) {
            addCriterion("temp_id <=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLike(String value) {
            addCriterion("temp_id like", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotLike(String value) {
            addCriterion("temp_id not like", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdIn(List<String> values) {
            addCriterion("temp_id in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotIn(List<String> values) {
            addCriterion("temp_id not in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdBetween(String value1, String value2) {
            addCriterion("temp_id between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotBetween(String value1, String value2) {
            addCriterion("temp_id not between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andFaceTotalIsNull() {
            addCriterion("face_total is null");
            return (Criteria) this;
        }

        public Criteria andFaceTotalIsNotNull() {
            addCriterion("face_total is not null");
            return (Criteria) this;
        }

        public Criteria andFaceTotalEqualTo(Integer value) {
            addCriterion("face_total =", value, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalNotEqualTo(Integer value) {
            addCriterion("face_total <>", value, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalGreaterThan(Integer value) {
            addCriterion("face_total >", value, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("face_total >=", value, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalLessThan(Integer value) {
            addCriterion("face_total <", value, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalLessThanOrEqualTo(Integer value) {
            addCriterion("face_total <=", value, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalIn(List<Integer> values) {
            addCriterion("face_total in", values, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalNotIn(List<Integer> values) {
            addCriterion("face_total not in", values, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalBetween(Integer value1, Integer value2) {
            addCriterion("face_total between", value1, value2, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andFaceTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("face_total not between", value1, value2, "faceTotal");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andHasWarnIsNull() {
            addCriterion("has_warn is null");
            return (Criteria) this;
        }

        public Criteria andHasWarnIsNotNull() {
            addCriterion("has_warn is not null");
            return (Criteria) this;
        }

        public Criteria andHasWarnEqualTo(String value) {
            addCriterion("has_warn =", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnNotEqualTo(String value) {
            addCriterion("has_warn <>", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnGreaterThan(String value) {
            addCriterion("has_warn >", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnGreaterThanOrEqualTo(String value) {
            addCriterion("has_warn >=", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnLessThan(String value) {
            addCriterion("has_warn <", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnLessThanOrEqualTo(String value) {
            addCriterion("has_warn <=", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnLike(String value) {
            addCriterion("has_warn like", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnNotLike(String value) {
            addCriterion("has_warn not like", value, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnIn(List<String> values) {
            addCriterion("has_warn in", values, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnNotIn(List<String> values) {
            addCriterion("has_warn not in", values, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnBetween(String value1, String value2) {
            addCriterion("has_warn between", value1, value2, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andHasWarnNotBetween(String value1, String value2) {
            addCriterion("has_warn not between", value1, value2, "hasWarn");
            return (Criteria) this;
        }

        public Criteria andWarnNumIsNull() {
            addCriterion("warn_num is null");
            return (Criteria) this;
        }

        public Criteria andWarnNumIsNotNull() {
            addCriterion("warn_num is not null");
            return (Criteria) this;
        }

        public Criteria andWarnNumEqualTo(String value) {
            addCriterion("warn_num =", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumNotEqualTo(String value) {
            addCriterion("warn_num <>", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumGreaterThan(String value) {
            addCriterion("warn_num >", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumGreaterThanOrEqualTo(String value) {
            addCriterion("warn_num >=", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumLessThan(String value) {
            addCriterion("warn_num <", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumLessThanOrEqualTo(String value) {
            addCriterion("warn_num <=", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumLike(String value) {
            addCriterion("warn_num like", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumNotLike(String value) {
            addCriterion("warn_num not like", value, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumIn(List<String> values) {
            addCriterion("warn_num in", values, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumNotIn(List<String> values) {
            addCriterion("warn_num not in", values, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumBetween(String value1, String value2) {
            addCriterion("warn_num between", value1, value2, "warnNum");
            return (Criteria) this;
        }

        public Criteria andWarnNumNotBetween(String value1, String value2) {
            addCriterion("warn_num not between", value1, value2, "warnNum");
            return (Criteria) this;
        }

        public Criteria andHasFingerIsNull() {
            addCriterion("has_finger is null");
            return (Criteria) this;
        }

        public Criteria andHasFingerIsNotNull() {
            addCriterion("has_finger is not null");
            return (Criteria) this;
        }

        public Criteria andHasFingerEqualTo(String value) {
            addCriterion("has_finger =", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerNotEqualTo(String value) {
            addCriterion("has_finger <>", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerGreaterThan(String value) {
            addCriterion("has_finger >", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerGreaterThanOrEqualTo(String value) {
            addCriterion("has_finger >=", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerLessThan(String value) {
            addCriterion("has_finger <", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerLessThanOrEqualTo(String value) {
            addCriterion("has_finger <=", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerLike(String value) {
            addCriterion("has_finger like", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerNotLike(String value) {
            addCriterion("has_finger not like", value, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerIn(List<String> values) {
            addCriterion("has_finger in", values, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerNotIn(List<String> values) {
            addCriterion("has_finger not in", values, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerBetween(String value1, String value2) {
            addCriterion("has_finger between", value1, value2, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andHasFingerNotBetween(String value1, String value2) {
            addCriterion("has_finger not between", value1, value2, "hasFinger");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseIsNull() {
            addCriterion("warn_analyse is null");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseIsNotNull() {
            addCriterion("warn_analyse is not null");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseEqualTo(String value) {
            addCriterion("warn_analyse =", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseNotEqualTo(String value) {
            addCriterion("warn_analyse <>", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseGreaterThan(String value) {
            addCriterion("warn_analyse >", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseGreaterThanOrEqualTo(String value) {
            addCriterion("warn_analyse >=", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseLessThan(String value) {
            addCriterion("warn_analyse <", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseLessThanOrEqualTo(String value) {
            addCriterion("warn_analyse <=", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseLike(String value) {
            addCriterion("warn_analyse like", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseNotLike(String value) {
            addCriterion("warn_analyse not like", value, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseIn(List<String> values) {
            addCriterion("warn_analyse in", values, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseNotIn(List<String> values) {
            addCriterion("warn_analyse not in", values, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseBetween(String value1, String value2) {
            addCriterion("warn_analyse between", value1, value2, "warnAnalyse");
            return (Criteria) this;
        }

        public Criteria andWarnAnalyseNotBetween(String value1, String value2) {
            addCriterion("warn_analyse not between", value1, value2, "warnAnalyse");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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