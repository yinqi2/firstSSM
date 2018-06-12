package com.yinqi.mapper;

import com.yinqi.bean.User;

import java.util.List;

public interface UserMapper {

    int insertUser(User user);

    List<User> queryByname(String username);
}
