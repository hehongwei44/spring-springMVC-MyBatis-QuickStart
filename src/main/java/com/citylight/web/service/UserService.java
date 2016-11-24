package com.citylight.web.service;

import com.citylight.web.domain.User;

/**
 * Created by Administrator on 2016/9/25.
 */
public interface UserService extends BaseService<User> {

    void add(User user) throws Exception;

    User findUser(User user) throws Exception;
}
