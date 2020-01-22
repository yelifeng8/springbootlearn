package net.xdclass.demo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 *
 1、常用框架 阿里 fastjson,谷歌gson等
 JavaBean序列化为Json，性能：Jackson > FastJson > Gson > Json-lib 同个结构
 Jackson、FastJson、Gson类库各有优点，各有自己的专长
 空间换时间，时间换空间

 2、jackson处理相关自动
 指定字段不返回：@JsonIgnore
 指定日期格式：@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
 空字段不返回：@JsonInclude(Include.NON_NUll)
 指定别名：@JsonProperty

 *
 */
public class User2 {

    private int age;

    @JsonIgnore
    private String pwd;

    //别名
    @JsonProperty("account")
    @JsonInclude(Include.NON_NULL)
    private String phone;


    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
    private Date createTime;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User2() {
        super();
    }

    public User2(int age, String pwd, String phone, Date createTime) {
        super();
        this.age = age;
        this.pwd = pwd;
        this.phone = phone;
        this.createTime = createTime;
    }
}


