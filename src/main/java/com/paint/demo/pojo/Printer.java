package com.paint.demo.pojo;


import lombok.Data;

@Data
/**
 * 画师
 */
public class Printer {
    private int id;
    private String avatar;
    private int identify;
    private String nickName;
    private int getImgTime;
    private String notice;
    private double rate;
    private String username;
    private String password;

}
