package com.miles.cxf.service;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class StudentServer {

	public static void main(String[] args) {
		// 使用jaxrsServerFactoryBean发布rest服务
		JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
		// 设置rest的服务地址
		jaxrsServerFactoryBean.setAddress("http://localhost:8080/rest");
		// 设置服务对象
		jaxrsServerFactoryBean.setServiceBean(new StudentServiceImpl());
		// 设置资源对象（如果有多个pojo对象，对象中间以","隔开即可）
		jaxrsServerFactoryBean.setResourceClasses(StudentServiceImpl.class);
		// 发布rest服务
		jaxrsServerFactoryBean.create();
	}

}
