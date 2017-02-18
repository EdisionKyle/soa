package com.miles.cxf.service;

import javax.xml.ws.Endpoint;

public class TestService {

	public static void main(String[] args) {
		/**
		//发布webservice服务
		//1、创建服务的发布工厂
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		//2、在工厂中，指定要发布的服务类(服务的实现类)
		factoryBean.setServiceClass(HelloSayImpl.class);
		//3、设置web请求的地址
		factoryBean.setAddress("http://localhost:8080/HelloTest");
		//4、使用工厂创建具体的web服务
		Server server = factoryBean.create();
		//5、启动服务
		server.start();
		*/
        HelloSayImpl implementor= new HelloSayImpl();
        String address="http://localhost:8080/helloSay";
        Endpoint.publish(address, implementor);
	}

}
