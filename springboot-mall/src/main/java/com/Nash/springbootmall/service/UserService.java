package com.Nash.springbootmall.service;

import com.Nash.springbootmall.dto.UserRegisterRequest;
import com.Nash.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);


}
