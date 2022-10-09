package com.Nash.springbootmall.service.impl;

import com.Nash.springbootmall.dao.UserDao;
import com.Nash.springbootmall.dto.UserRegisterRequest;
import com.Nash.springbootmall.model.User;
import com.Nash.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
