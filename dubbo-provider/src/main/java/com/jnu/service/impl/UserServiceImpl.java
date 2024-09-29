package com.jnu.service.impl;

import com.jnu.entity.User;
import com.jnu.mapper.UserMapper;
import com.jnu.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 小何
 * @Date 2024/9/28 22:41
 **/
@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(String name) {
        userMapper.deleteUser(name);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
