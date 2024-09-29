package com.jnu.controller;

import com.jnu.entity.User;
import com.jnu.response.Result;
import com.jnu.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author 小何
 * @Date 2024/9/28 22:45
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @DubboReference
    public UserService userService;


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Result addUser(@RequestParam("name")String name, @RequestParam("age")Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userService.addUser(user);
        return Result.ok();
    }


    @RequestMapping(value = "select", method = RequestMethod.GET)
    public Result selectUser(@RequestParam("name")String name) {
        List<User> userList = userService.getUserByName(name);
        return Result.ok().data("list", userList);
    }

}
