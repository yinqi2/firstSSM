package com.yinqi.service.impl;
import com.yinqi.bean.User;
import com.yinqi.exception.AgeException;
import com.yinqi.exception.NameException;
import com.yinqi.mapper.UserMapper;
import com.yinqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * user服务bean
 * 作者： 尹棋
 * 日期： 2018年6月22日
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	//根据类型自动转入
    @Autowired
    protected UserMapper userMapper;

    public int insertUser(User user) throws Exception {

        if ("".equals(user.getUsername().trim())){
            throw new NameException("名称不符合规范。");
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
