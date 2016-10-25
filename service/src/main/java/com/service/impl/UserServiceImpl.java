package com.service.impl;

import com.Mapper.UserMapper;
import com.bean.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangyong on 16-10-24.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserByPhone(String phone) {
        return userMapper.getUser(phone);
    }
}
