package com.paint.demo.Service.Impl;

import com.paint.demo.Dao.userDao;
import com.paint.demo.Service.userService;
import com.paint.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class userServiceImpl implements userService {

    @Autowired
    private userDao userDao;


}
