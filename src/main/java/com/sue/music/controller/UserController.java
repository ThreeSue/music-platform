package com.sue.music.controller;

import com.sue.music.entity.User;
import com.sue.music.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 蘇世睿
 * @Class: 移動互聯2412
 * @SeatNo: 21
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date: 2026/9/10
 * @Time: 15:33
 */


@RestController
public class UserController {

    @Resource
    private UserService userService;
    /**
    * 查询用户
     * @return 用户列表
    */
    @GetMapping("/user/list")
    private User getUsers() {
        return userService.list().get(0);
    }

    /**
     * 新增用户
     * @param user
     * @return 新增用户id
     */
    @PostMapping("/user/add")
    public Long addUser(@RequestBody User user) {
        userService.save(user);
        return user.getId();
    }

//    private String updateUser(@RequestBody User user) {}
//
//    private Stirng deleteUser(){}

    @PutMapping("/user/update")
    public String updateUser(@RequestBody User user) {
        boolean success = userService.updateById(user);
        return success ? "修改成功" : "修改失败";
    }

    // 删除用户：根据 id 删除
    @DeleteMapping("/user/delete")
    public String deleteUser(@RequestParam Long id) {
        boolean success = userService.removeById(id);
        return success ? "删除成功" : "删除失败";
    }
}
