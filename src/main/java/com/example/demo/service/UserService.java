package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Integer selectByUserNumber(Long userNumber) {

      return  userMapper.selectByUserNumber(userNumber);
    }

    public User login(User user) {
        return  userMapper.login(user);
    }
}
