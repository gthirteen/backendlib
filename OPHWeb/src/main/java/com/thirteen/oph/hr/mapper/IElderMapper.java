package com.thirteen.oph.hr.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.hr.model.ElderModel;

@Mapper
public interface IElderMapper {

    public void insert(ElderModel em) throws Exception;
    public void update(ElderModel em) throws Exception;
    public void delete(ElderModel em) throws Exception;
    
    public void updatePhoto(ElderModel em) throws Exception;
    
    public ElderModel selectById(String id) throws Exception;
    
    // Select all info, room info included
    public List<ElderModel> selectAll() throws Exception;
    public int selectCountAll() throws Exception;
    public List<ElderModel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    
    // Select all info by room, room info included
    public List<ElderModel> selectAllByRoom(String id) throws Exception;
    
    // list: paged, department included, by condition
    public List<ElderModel> selectAllByCondition(
            @Param("start") int start, @Param("rows") int rows,
            @Param("startBirthday") Date startBirthday, @Param("endBirthday") Date endBirthday,
            @Param("startJoinDate") Date startJoinDate, @Param("sex") String sex,
            @Param("roomid") String roomid,
            @Param("nameKey") String nameKey) throws Exception;
    
    public Integer countAllByCondition(
            @Param("startBirthday") Date startBirthday, @Param("endBirthday") Date endBirthday,
            @Param("startJoinDate") Date startJoinDate, @Param("sex") String sex,
            @Param("roomid") String roomid,
            @Param("nameKey") String nameKey) throws Exception;
    
    // add hobbies
    //public void insertHobbies(@Param("id") String id, @Param("nos") List<Integer> nos) throws Exception;
}
