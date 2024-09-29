package com.jnu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jnu.entity.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author 小何
 * @Date 2024/9/28 22:28
 **/
public interface UserMapper extends BaseMapper<User> {

    void updateUser(User user);

    void deleteUser(String name);

    List<User> getUserByName(String name);

}
