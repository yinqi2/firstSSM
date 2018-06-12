package com.yinqi.service.impl;

import com.yinqi.bean.User;
import com.yinqi.exception.AgeException;
import com.yinqi.exception.NameException;
import com.yinqi.mapper.UserMapper;
import com.yinqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserMapper userMapper;

    public int insertUser(User user) throws Exception {

        if ("".equals(user.getUsername().trim())){
            throw new NameException("名称不符合规范");
        }
        if (user.getUserage() > 40 || user.getUserage()<18){
            throw new AgeException("年龄不符合");
        }
        return userMapper.insertUser(user);
    }

    public List<User> findByname(String username) {
        return userMapper.queryByname(username);
    }
}
