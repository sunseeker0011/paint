package com.paint.demo.pojo;


import lombok.Data;

@Data
/**
 * 用户
 */
public class User {
    private int id;
    private String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getGetImgTime() {
        return getImgTime;
    }

    public void setGetImgTime(int getImgTime) {
        this.getImgTime = getImgTime;
    }

    public int getIdentify() {
        return identify;
    }

    public void setIdentify(int identify) {
        this.identify = identify;
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

    private String nickName;
    private int getImgTime;
    private int identify;
    private String userName;
    private String password;
}
