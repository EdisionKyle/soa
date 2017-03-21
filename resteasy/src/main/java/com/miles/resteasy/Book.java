package com.miles.resteasy;

import java.io.Serializable;

/**
 *  说明：书籍实体
 *  创建时间：2017年2月17日 下午5:42:34
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner 萬里獨行
 */
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private Double price;
	private String publishBy;

	public Book() {
		super();
	}

	public Book(String name, Double price, String publishBy) {
		super();
		this.name = name;
		this.price = price;
		this.publishBy = publishBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPublishBy() {
		return publishBy;
	}

	public void setPublishBy(String publishBy) {
		this.publishBy = publishBy;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", publishBy="
				+ publishBy + "]";
	}

}
