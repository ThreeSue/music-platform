package com.sue.music.controller;

import com.sue.music.entity.User;
import com.sue.music.mapper.UserMapper;
import com.sue.music.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: 蘇世睿
 * @Class: 移動互聯2412
 * @SeatNo: 21
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date: 2026/9/10
 * @Time: 15:33
 */
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/list")
    private List<User> getAllUser() {
        return userService.list();
    }
}
