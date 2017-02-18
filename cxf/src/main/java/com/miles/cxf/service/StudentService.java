package com.miles.cxf.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.miles.cxf.pojo.Student;

@WebService
@Path("/student")
public interface StudentService {

	// 查询学生信息
	@GET
	// http的get方法
	@Path("/query/{id}")
	// id参数通过url传递
	@Produces(MediaType.APPLICATION_XML)
	// 设置媒体类型xml格式
	public Student queryStudent(@PathParam("id") long id);

	// 查询学生列表
	@GET
	@Path("/queryList/{type}")
	// 设置媒体类型为XML格式和JSON格式
	@Produces(MediaType.APPLICATION_XML)
	/*
	 * 如果想让rest返回xml,需要在rest的url后边添加 ?_type=xml,默认为xml
	 * 如果想让rest返回json.需要在rest的url后边添加?_type=json
	 */
	public List<Student> queryStudentList(@PathParam("type") String type);

}
