package com.yinqi.service;

import com.yinqi.bean.User;
import com.yinqi.exception.NameException;

import java.util.List;

public interface UserService {

    int insertUser(User user) throws NameException, Exception;

    List<User> findByname(String username);
}
