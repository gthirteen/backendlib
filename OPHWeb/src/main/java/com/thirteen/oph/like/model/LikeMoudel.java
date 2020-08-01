package com.thirteen.oph.like.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("like")
public class LikeMoudel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id = null;
    private String name = null;
    private String like = null;
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
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	
    
}