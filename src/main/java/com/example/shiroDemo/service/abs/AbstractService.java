package com.example.shiroDemo.service.abs;


import com.example.shiroDemo.utils.PaginationEntity;

import java.util.HashMap;
import java.util.Map;

/** 
* @Description: TODO
* @Param:  
* @return:  
* @Author: ma.kangkang
* @Date: 2019/9/26 
*/ 
public class AbstractService {

    public Map<String, Object> handleParams(PaginationEntity<? extends PaginationEntity> page) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("start", page.getStart());
        params.put("pageSize", page.getPageSize());
        return params;
    }
}
