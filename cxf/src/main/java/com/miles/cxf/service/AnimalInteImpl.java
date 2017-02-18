package com.miles.cxf.service;


public class AnimalInteImpl<T> implements AnimalInte<T> {

	public String getName(T t) {
		return "类型：" + t.getClass().getName();
	}

}
