package com.sue.music;

import com.sue.music.entity.User;
import com.sue.music.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @Author: 蘇世睿
 * @Class: 移動互聯2412
 * @SeatNo: 21
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date: 2026/9/10
 * @Time: 23:43
 */

@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("===============getAllUser==========");
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(),"");
        userList.forEach(System.out::println);
    }



}
