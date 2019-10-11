package com.example.shiroDemo.controller;

import com.example.shiroDemo.commons.ResponseEntity;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
* @Description: TODO
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2019/9/26
*/
@RestController
public class HelloController {

    /**
    * @Description: 多角色的情况
    * @Author: ma.kangkang
    * @Date: 2019/10/10
    */
    @RequiresRoles(value = {"","","",""},logical = Logical.OR)
    @RequestMapping("/hello")
    public Map greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        Map result = new HashMap<>();
        try {
            result.putAll(ResponseEntity.responseSuccess("返回 hello"));
        }catch (Exception e) {
            result.putAll(ResponseEntity.responseError());
        }
        return result;
    }

    /**
     * “role”拥有角色正常访问
     * @return
     */
    @RequiresRoles("role")
    @RequiresPermissions("admin")
    @RequestMapping("/test")
    public Map test() {
        return ResponseEntity.responseSuccess("角色正确,可以请求该方法");
    }

    /**
     * “admin:*”拥有权限正常访问
     * @return
     */
    @RequiresPermissions("admin")
    @RequestMapping("/test2")
    public Map test2() {
        return ResponseEntity.responseSuccess("权限正确,可以请求该方法");
    }
}
