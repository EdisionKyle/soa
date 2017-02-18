package com.miles.cxf.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * 接口实现
 * 
 * @author milesloner
 *
 */
@WebService(endpointInterface = "com.miles.cxf.service.HelloSay")
@SOAPBinding(style = Style.RPC)
public class HelloSayImpl implements HelloSay {

	public String sayHello(String msg) {
		// 服务器端的提示
		System.out.println("CXF的WebService被调用..." + msg);
		return "Hello，" + msg;
	}

	// 泛型方法实现两个数相加
	public <T extends Number> String add(T t1, T t2) {
		double sum = 0.0;
		sum = t1.doubleValue() + t2.doubleValue();
		return String.valueOf(sum);
	}

}
