package com.alipanpan.ui.bean;

public class Customer {

    private Integer id;

    private String name;

    private String sex;

    private String nation;

    private Integer age;

    private String level;

    private Double deal;

    private String mobile;

    private String email;

    public Customer() {
    }

    public Customer(String name, String sex, String nation, Integer age, String level, Double deal, String mobile, String email) {
        this.name = name;
        this.sex = sex;
        this.nation = nation;
        this.age = age;
        this.level = level;
        this.deal = deal;
        this.mobile = mobile;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getDeal() {
        return deal;
    }

    public void setDeal(Double deal) {
        this.deal = deal;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
