package com.youha.service;

import com.youha.mapper.UserMapper;
import com.youha.model.User;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhenchao on 16/8/6.
 */
@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id){
        User user =   userMapper.selectByPrimaryKey(id);
        return user;
    }


}
