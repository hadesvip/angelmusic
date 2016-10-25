package com.service;

import com.bean.User;

/**
 * Created by wangyong on 16-10-24.
 */
public interface UserService {

    User getUserByPhone(String phone);
}
