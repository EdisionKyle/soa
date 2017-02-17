package com.miles.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *  说明：
 *  创建时间：2017年2月17日 下午5:44:56
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
@Path("/messageservice")  
public class MessageService {

	public MessageService() {
	}

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		String result = "Hello : " + msg;

		return Response.status(200).entity(result).build();
	}

} 
