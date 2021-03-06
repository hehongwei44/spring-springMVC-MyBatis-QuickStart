package com.citylight.web.service.serviceImpl;

import com.citylight.web.dao.UserDao;
import com.citylight.web.domain.User;
import com.citylight.web.exception.OtherThingsException;
import com.citylight.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 添加用户，一般来说需要检查用户为空、用户名为空、密码为空
     */
    public void add(User user) throws OtherThingsException {

        int result = 0; //受影响的行数默认为0
        try {
            result = userDao.add(user);
        } catch (Exception e) {
            System.out.println("添加用户失败,用户已经存在");
            //其他用户添加失败异常
            throw new OtherThingsException(e);
        }
        if (result > 0)
            System.out.println("添加用户成功");
    }

    /**
     * 查找用户
     *
     * @param user 用户bean
     * @throws Exception
     */
    public User findUser(User user) {

        return userDao.findOneById(user.getLoginId());
    }


}
