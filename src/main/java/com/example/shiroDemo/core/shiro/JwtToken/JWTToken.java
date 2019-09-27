package com.example.shiroDemo.core.shiro.JwtToken;

import org.apache.shiro.authc.AuthenticationToken;

/**
* @Description: JWTToken
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2019/9/26
*/
public class JWTToken implements AuthenticationToken {

    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
