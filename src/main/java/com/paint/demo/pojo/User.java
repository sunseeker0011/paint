package com.paint.demo.pojo;


import lombok.Data;

@Data
/**
 * 用户
 */
public class User {
    private int id;
    private String avatar;
    private String nickName;
    private int getImgTime;
    private int identify;
    private String userName;
    private String password;
}
