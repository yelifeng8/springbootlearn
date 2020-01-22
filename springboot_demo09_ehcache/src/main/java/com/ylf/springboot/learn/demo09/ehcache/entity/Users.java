package com.ylf.springboot.learn.demo09.ehcache.entity;

public class Users {

    private Long id;
    private String name;
    private Integer age;



    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}


