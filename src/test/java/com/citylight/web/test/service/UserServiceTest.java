package com.citylight.web.test.service;

import com.citylight.web.domain.User;
import com.citylight.web.exception.OtherThingsException;
import com.citylight.web.service.serviceImpl.UserServiceImpl;
import com.citylight.web.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/9/25.
 */
public class UserServiceTest extends BaseTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testAdd() {
        User user = new User();
        try {
            userService.add(user);
        } catch (OtherThingsException e) {
            //其他综合异常或是不能处理的异常
            e.printStackTrace();
        }


    }
}
