package com.thirteen.oph.pm.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import com.thirteen.oph.hr.model.ElderModel;

@Alias("Room")
public class RoomModel implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String id = null;
    private int layout = -1;
    private List<ElderModel> members = null;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getLayout() {
        return layout;
    }
    public void setLayout(int layout) {
        this.layout = layout;
    }
    public List<ElderModel> getMembers() {
        return members;
    }
    public void setMembers(List<ElderModel> members) {
        this.members = members;
    }
    
}
