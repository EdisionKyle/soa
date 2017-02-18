package com.miles.resteasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *  说明：BookService
 *  创建时间：2017年2月17日 下午5:42:14
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
@Path("/book") // 服务路径
public class BookService {

	/**
	 * 初始化三本书籍数据，存入map中，key为用户id，value为书籍用户对象
	 */
	static Map<Integer, Book> bookMap = new HashMap<>();
	static {
		Book book1 = new Book("Java高级编程", 24.3, "工业出版社");
		bookMap.put(1, book1);
		Book book2 = new Book("Spring4实战进阶", 25.45, "人民出版社");
		bookMap.put(2, book2);
		Book book3 = new Book("C版数据结构与算法", 26.23, "新华出版社");
		bookMap.put(3, book3);
	}

	/**
	 * 获取指定id的书籍
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("detail/{id}")
	// 具体服务的路径, id是入参
	@Produces(MediaType.APPLICATION_JSON)
	// 返回的格式
	public Book getById(@PathParam("id") Integer id) {
		return (Book) bookMap.get(id);
	}

	/**
	 * 以json格式返回所有书籍
	 * 
	 * @return
	 */
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getUsers() {
		List<Book> bookList = new ArrayList<Book>();
		for (Entry<Integer, Book> book : bookMap.entrySet()) {
			bookList.add(book.getValue());
		}
		return bookList;
	}

}
