package com.example.demo_data_jpa.entity;

import javax.persistence.*;

//使用JPA注解配置映射关系
@Entity     //告诉JPA这是一个实体类
@Table(name = "tbl_user")   //指定和哪个表对应，不写默认是类名
public class User {
    @Id     //表明是一个自增主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;
    @Column(name = "last_name",length = 50) //列名对应
    private String lastName;
    @Column
    private String email;   //默认就是属性名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
