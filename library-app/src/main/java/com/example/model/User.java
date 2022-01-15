package com.example.model;

import java.time.LocalDate;

public class User {

    private int id;
    private String userName;
    private String password;
    private LocalDate createdDate;

    public User() {}

    public User(int id, String userName, String password, LocalDate createdDate) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

}
