package com.jnu.service;

import com.jnu.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 增加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 产出用户
     * @param name
     */
    void deleteUser(String name);

    /**
     * 查询用户
     * @param name
     * @return
     */
    List<User> getUserByName(String name);
}
