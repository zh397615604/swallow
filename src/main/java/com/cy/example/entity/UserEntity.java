package com.cy.example.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Repository
public class UserEntity extends BaseEntity{
	
	private String c_username;
	
	private String c_pwd;
	
	private String c_phone;
	
	private String n_age;
	
	private String n_sex;
	
	private int n_status;
	
	private List<SysRoleEntity> roleList;// 一个用户具有多个角色

	public String getC_username() {
		return c_username;
	}

	public void setC_username(String c_username) {
		this.c_username = c_username;
	}

	public String getC_pwd() {
		return c_pwd;
	}

	public void setC_pwd(String c_pwd) {
		this.c_pwd = c_pwd;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getN_age() {
		return n_age;
	}

	public void setN_age(String n_age) {
		this.n_age = n_age;
	}

	public String getN_sex() {
		return n_sex;
	}

	public void setN_sex(String n_sex) {
		this.n_sex = n_sex;
	}

	public int getN_status() {
		return n_status;
	}

	public void setN_status(int n_status) {
		this.n_status = n_status;
	}

	public List<SysRoleEntity> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<SysRoleEntity> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "User [c_username=" + c_username + ", c_pwd="
				+ c_pwd + ", c_phone=" + c_phone + ", n_age=" + n_age
				+ ", n_sex=" + n_sex + "]";
	}
	
    /*public Set<String> findRolesName() {
        List<SysRoleEntity> roles = getRoleList();
        Set<String> set = new HashSet<String>();
        for (SysRoleEntity role : roles) {
            set.add(role.getC_roleName());
        }
        return set;
    }*/

	public byte[] getCredentialsSalt() {
		// TODO Auto-generated method stub
		return this.c_username.getBytes();
	}
}