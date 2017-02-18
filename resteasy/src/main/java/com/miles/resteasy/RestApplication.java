package com.miles.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 *  说明：
 *  创建时间：2017年2月18日 下午6:10:14
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class RestApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RestApplication() {
		singletons.add(new UserService());
		singletons.add(new BookService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
