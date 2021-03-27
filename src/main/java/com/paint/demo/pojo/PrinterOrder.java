package com.paint.demo.pojo;


import lombok.Data;


@Data
/**
 * 我的企划
 */
public class PrinterOrder {
    private int id;
    private int orderId;
    private int printerId;
    private int state;
}
