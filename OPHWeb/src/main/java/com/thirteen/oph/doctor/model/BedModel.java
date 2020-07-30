package com.thirteen.oph.doctor.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("bed")
public class BedModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id = null;
    private String name = null;
    private String docter = null;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocter() {
		return docter;
	}
	public void setDocter(String docter) {
		this.docter = docter;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setId(String id) {
		this.id = id;
	}
	
    
}
