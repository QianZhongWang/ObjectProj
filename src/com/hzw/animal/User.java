package com.hzw.animal;

public class User {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public User(String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
    }
}
