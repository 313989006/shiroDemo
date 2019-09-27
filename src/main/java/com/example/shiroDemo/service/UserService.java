package com.example.shiroDemo.service;


import com.example.shiroDemo.model.User;

import java.util.List;
import java.util.Map;

/**
* @Description: 用户service层
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2019/9/26
*/
public interface UserService {

    User getUserByUserName(String userName);

    Map<String, Object> getRolesAndPermissionsByUserName(String userName);

    Map<String, Object> createRandomToken(String textStr);

    boolean checkRandomToken(String sToken, String textStr);

    void addTokenToRedis(String userName, String jwtTokenStr);

    boolean removeJWTToken(String userName);

    List<User> listOnLineUser();
}
