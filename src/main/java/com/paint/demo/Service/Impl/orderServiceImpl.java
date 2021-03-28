package com.paint.demo.Service.Impl;

import com.paint.demo.Dao.orderDao;
import com.paint.demo.Service.orderService;
import com.paint.demo.pojo.Order;

public class orderServiceImpl implements orderService {

    private orderDao orderDao;

    @Override
    public Order getAll() {
        Order list=orderDao.selectAll();
        return list;
    }
}
