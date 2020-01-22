package com.ylf.springboot.learn.demo03.mybatis01.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
