package com.miles.cxf.pojo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentVoList implements Serializable {

	/**
	     * 
	     */
	private static final long serialVersionUID = -2200047544608641662L;
	private List<StudentVo> StudentVoList;

	public StudentVoList() {
	}

	public StudentVoList(List<StudentVo> StudentVoList) {
		this.StudentVoList = StudentVoList;
	}

	public List<StudentVo> getStudentVoList() {
		return StudentVoList;
	}

	public void setStudentVoList(List<StudentVo> StudentVoList) {
		this.StudentVoList = StudentVoList;
	}

	@Override
	public String toString() {
		return "{StudentVoList=" + StudentVoList + "}";
	}

}
