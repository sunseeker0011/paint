package com.paint.demo.pojo;

import lombok.Data;

import java.sql.Timestamp;


@Data
/**
 * 订单
 */
public class Order {
    private int id;
    private int userId;
    private int printerId;
    private String title;
    private String content;
    private int money;
    private String style;
    private Timestamp limitTime;
    private int state;
    private String drawings;

}
