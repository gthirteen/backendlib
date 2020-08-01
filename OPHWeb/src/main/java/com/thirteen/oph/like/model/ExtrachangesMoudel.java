package com.thirteen.oph.like.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("extrachanges")
public class ExtrachangesMoudel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id = null;
    private String name = null;
    private String extrachanges;
	public String getId() {
		return id;
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
	public void setId(String id) {
		this.id = id;
	}
	public String getExtrachanges() {
		return extrachanges;
	}
	public void setExtrachanges(String extrachanges) {
		this.extrachanges = extrachanges;
	}
	
    
}