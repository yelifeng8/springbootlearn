package com.ylf.springboot.learn.demo04.mybatis02.entity;

import lombok.Data;

//@Getter
//@Setter
@Data
public class User {
    private Integer id;
    private Integer age;
    private String name;

    public static void main(String[] args){

        //@Data = @Getter + @Setter

    }

}
