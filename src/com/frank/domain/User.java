package com.frank.domain;

public class User {
    private String username;
    private String password;
    private String sex;
    private int age;
    private int admin = 0;

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getAdmin() {
        return admin;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getUsername() {
        return username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public boolean isAdmin(){
        if (this.admin==1)
            return  true;
        else return false;
    }
}
