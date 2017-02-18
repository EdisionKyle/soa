package com.miles.cxf.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.miles.cxf.pojo.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student queryStudent(long id) {
		// 使用静态数据来表示
		Student student = new Student();
		student.setId(id);
		student.setName("张三");
		student.setBirthday(new Date());
		return student;
	}

	@Override
	public List<Student> queryStudentList(String type) {
		// 使用静态数据来表示
		List<Student> list = new ArrayList<>();
		Student student1 = new Student();
		student1.setId(1001);
		student1.setName("张三");
		student1.setBirthday(new Date());

		Student student2 = new Student();
		student2.setId(1002);
		student2.setName("张三");
		student2.setBirthday(new Date());

		list.add(student1);
		list.add(student2);

		return list;
	}

}
