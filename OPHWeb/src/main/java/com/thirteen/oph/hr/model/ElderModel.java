package com.thirteen.oph.hr.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.thirteen.oph.pm.model.RoomModel;

@Alias("Elder")
public class ElderModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id = null;
    private String name = null;
    private String sex = null;
    private Date birthday = null;
    private Date joinday = null;
    private Date leaveday = null;
    private String photoPath = null;
    private RoomModel room = null; // room_id
    
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Date getJoinday() {
        return joinday;
    }
    public void setJoinday(Date joinday) {
        this.joinday = joinday;
    }
    public Date getLeaveday() {
        return leaveday;
    }
    public void setLeaveday(Date leaveday) {
        this.leaveday = leaveday;
    }
    public RoomModel getRoom() {
        return room;
    }
    public void setRoom(RoomModel room) {
        this.room = room;
    }
    public String getPhotoPath() {
        return photoPath;
    }
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
    
}
