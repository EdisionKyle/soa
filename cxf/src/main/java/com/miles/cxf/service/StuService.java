package com.miles.cxf.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.miles.cxf.pojo.StudentVo;
import com.miles.cxf.pojo.StudentVoList;

@Path("/stuService")
@Produces(MediaType.APPLICATION_JSON)
public interface StuService {
 
    @GET
    @Path("/status")
    public String getStatus();
 
    @GET
    @Path("/students/{index}")
    public StudentVo getStudentById(@PathParam("index") Integer id);
 
    @GET
    @Path("/students")
    public StudentVoList getStudentList();
}
