package com.lichuan.entity;

public class User {
//主分支 记住哈
    private String uid;
    private String username;
    private String password;
    private String nihao;
    private String woshi;
    public String getNihao() {
        return nihao;
    }

    public String getWoshi() {
        return woshi;
    }

    public void setWoshi(String woshi) {
        this.woshi = woshi;
    }

    public void setNihao(String nihao) {
        this.nihao = nihao;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}
