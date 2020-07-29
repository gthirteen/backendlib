package com.thirteen.oph.hr.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Department")
public class DepartmentModel implements Serializable {
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

}
