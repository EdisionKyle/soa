package com.miles.cxf.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * 接口定义
 * 
 * @author milesloner
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloSay {

	public String sayHello(String msg);

	public <T extends Number> String add(T t1, T t2);

}
