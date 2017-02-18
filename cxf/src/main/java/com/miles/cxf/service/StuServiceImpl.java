package com.miles.cxf.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.miles.cxf.pojo.StudentVo;
import com.miles.cxf.pojo.StudentVoList;

public class StuServiceImpl implements StuService {
	private static List<StudentVo> list = new ArrayList<StudentVo>();

    static {
        for (int i = 0; i < 10; i++) {
            StudentVo vo = new StudentVo(i, "name" + i, Math.round(100.0f),
                    "desc" + i, (i & 1) == 0);
            list.add(vo);
        }
    }

    /**
     * url:http://<host>:<port>/<appcontext>/services/studentService/status
     */
    @Override
    @GET
    @Path("/status")
    public String getStatus() {
        return "getStatus";
    }

    /**
     * url:http://<host>:<port>/<appcontext>/services/studentService/students/{
     * index}
     */
    @Override
    @GET
    @Path("/students/{index}")
    public StudentVo getStudentById(@PathParam("index") Integer id) {
        List<StudentVo> studentList = list;
        StudentVo vo = null;
        if (studentList.size() > id) {
            vo = studentList.get(id - 1);
        }
        return vo;
    }

    /**
     * url:http://<host>:<port>/<appcontext>/services/studentService/students
     */
    @Override
    @GET
    @Path("/students")
    public StudentVoList getStudentList() {
        List<StudentVo> studentList = list;
        StudentVoList listVo = new StudentVoList(studentList);
        return listVo;
    }

}
