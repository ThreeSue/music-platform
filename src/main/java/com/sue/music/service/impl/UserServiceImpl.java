package com.sue.music.service.impl;

import com.baomidou.mybatisplus.spring.service.impl.ServiceImpl;
import com.sue.music.entity.User;
import com.sue.music.mapper.UserMapper;
import com.sue.music.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: 蘇世睿
 * @Class: 移動互聯2412
 * @SeatNo: 21
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date: 2026/9/10
 * @Time: 15:30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
