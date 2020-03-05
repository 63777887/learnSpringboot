package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ConfigurationProperties
 * 将配置文件中的每一个属性映射到这个组件中
 * 组件必须加入容器中才能使用容器中的@ConfigurationProperties功能
 */

@Component
//@PropertySource(value = {"classpath:person.properties"})  //--> 配置文件换成person.properties
@ConfigurationProperties(prefix = "person")     //--> 从全局配置文件中获取值
public class Person {
    private String name;
    private Integer age;
    private boolean boss;
    private Map map;

    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", map=" + map +
                ", dog=" + dog +
                '}';
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
