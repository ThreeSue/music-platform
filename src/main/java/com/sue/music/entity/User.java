package com.sue.music.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: 蘇世睿
 * @Class: 移動互聯2412
 * @SeatNo: 21
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date: 2026/9/10
 * @Time: 15:26
 */
@Data
@TableName("user")
public class User {
    private Long id;

    private String name;

    private String email;

    private int age;

//    alt +insert

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
