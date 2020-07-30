package com.thirteen.oph.doctor.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Doctor")
public class DoctorModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id = null;
    private String name = null;
    private String department = null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
 
}
