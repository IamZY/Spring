package com.ntuzy.spring5.entity;

/**
 * @Author IamZY
 * @create 2020/7/7 9:36
 */
public class Book {
    private int userId;
    private String username;
    private String ustatus;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
