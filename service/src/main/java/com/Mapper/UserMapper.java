package com.Mapper;

import com.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by wangyong on 16-10-24.
 */
@Mapper
@Repository
public interface UserMapper {

    User getUser(String phone);

}
