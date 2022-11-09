package com.jay.usercenter.service;

import com.jay.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
* @author admian
 *
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-11-06 16:48:39
*/
public interface UserService extends IService<User> {
    /**
     * 用户注释
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return  新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 登录后的用户信息
     */
    User doLogin(String userAccount, String userPassword, HttpServletRequest request);
}
