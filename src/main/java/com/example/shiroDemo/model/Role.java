package com.example.shiroDemo.model;

import com.example.shiroDemo.utils.PaginationEntity;

import java.io.Serializable;
import java.util.List;

/**
* @Description: 角色实体类
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2019/9/26
*/
public class Role  extends PaginationEntity implements Serializable {
	private Integer rid;
	private String roleName;
	private String desc;
	private List<Permission> permissions;

	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}
