package com.jay.usercenter.service;
import java.util.Date;

import com.jay.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务注册
 * @author jay
 */
@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("jay");
        user.setUserAccount("123");
        user.setAvatarUrl("123");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("13");
        user.setEmail("123");


        boolean res = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(res);

    }
}