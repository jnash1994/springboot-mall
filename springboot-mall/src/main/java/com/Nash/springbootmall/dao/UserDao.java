package com.Nash.springbootmall.dao;

import com.Nash.springbootmall.dto.UserRegisterRequest;
import com.Nash.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);


}
