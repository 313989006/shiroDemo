package com.example.shiroDemo.model;


import com.example.shiroDemo.utils.PaginationEntity;

import java.io.Serializable;

/**
* @Description: 权限实体类
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2019/9/26
*/
public class Permission  extends PaginationEntity implements Serializable {
	private Integer pid;
	private String permissionName;
	private  String desc;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
