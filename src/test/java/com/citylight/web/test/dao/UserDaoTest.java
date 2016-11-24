package com.citylight.web.test.dao;

import com.citylight.web.dao.UserDao;
import com.citylight.web.domain.User;
import com.citylight.web.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAdd() {
        User user = new User();
        user.setLoginId("liangyitest");
        user.setName("两仪2");
        user.setPwd("1234567");
        user.setSex("男");
        int result = 0; //受影响的行数默认为0
        try {
            result = userDao.add(user);
            System.out.print("---------result:---------"+result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("添加用户失败");
        }
        if (result > 0)
            System.out.println("添加用户成功");
    }

    @Test
    public void testFindOneId() throws Exception {
        User user = new User();
        user.setLoginId("pc147852369");
        User result = null; //受影响的行数默认为0
        try {
            result = userDao.findOneById(user.getLoginId());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("查找用户失败");
        }
        if (null != result)
            System.out.println("查找用户成功\n" + result.toString());
    }

    @Test
    public void testDel() {
        User user = new User();
        user.setLoginId("liangyitest");
        int result = 0; //受影响的行数默认为0
        try {
            result = userDao.del(user);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("删除用户失败");
        }
        if (result > 0)
            System.out.println("删除用户成功");
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setLoginId("pc147852369");
        user.setName("手把手教程");
        user.setPwd("123456");
        user.setSex("男");
        int result = 0; //受影响的行数默认为0
        try {
            result = userDao.update(user);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("更新用户信息用户失败");
        }
        if (result > 0)
            System.out.println("更新用户信息用户成功");

    }
}
