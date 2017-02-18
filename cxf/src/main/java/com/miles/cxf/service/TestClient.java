package com.miles.cxf.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class TestClient {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
		svr.setServiceClass(HelloSay.class);
		svr.setAddress("http://localhost:8080/helloSay");
		HelloSay hw = (HelloSay) svr.create();
		System.out.println(hw.sayHello("恭喜发财，大吉大利！"));
	}

}
