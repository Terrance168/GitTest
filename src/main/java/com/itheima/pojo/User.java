package com.itheima.pojo;

import java.io.Serializable;

/**
 * @Author: Terrance
 * @Date: 2020-09-15 9:32
 */
public class User implements Serializable {
    private String name;
    private String email;

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
}
