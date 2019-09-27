package com.example.shiroDemo.dao;

import java.util.Set;

/**
* @Description: TODO
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2019/9/26
*/
public interface PermissionDAO {

    public Set<String> listPermission(String userName);
}
