package com.thirteen.oph.doctor.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("illness")
public class IllnessModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id = null;
    private String name = null;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
