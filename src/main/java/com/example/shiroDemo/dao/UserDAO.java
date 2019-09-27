package com.example.shiroDemo.dao;


import com.example.shiroDemo.model.User;

import java.util.List;
import java.util.Map;

/** 
* @Description: TODO
* @Param:  
* @return:  
* @Author: ma.kangkang
* @Date: 2019/9/26 
*/ 
public interface UserDAO {
    public User findByName(String userName);

    public List<User> getAllUser(Map<String, Object> param);

    public Integer getUserTotal(Map<String, Object> param);

    public User listRolesAndPermissions(String userName);

    public boolean doCreate(User vo);

    public boolean doUpdate(User vo);

    public boolean doRemove(Object[] ids);

    public List<User> listUserByNams(Object[] names);


}
