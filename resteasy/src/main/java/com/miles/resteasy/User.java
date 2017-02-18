package com.miles.resteasy;

import java.io.Serializable;

/**
 *  说明：用户实体
 *  创建时间：2017年2月17日 下午5:42:34
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String tel;

	public User() {
		super();
	}

	public User(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}

}
