package com.thirteen.oph.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.hr.model.ElderModel;

@Mapper
public interface IElderMapper {

    public void insert(ElderModel dm) throws Exception;
    public void update(ElderModel dm) throws Exception;
    public void delete(ElderModel dm) throws Exception;
    
    public ElderModel selectById(String id) throws Exception;
    
    // Select all info, Department and hobbies included
    public List<ElderModel> selectAll() throws Exception;
    public int selectCountAll() throws Exception;
    public List<ElderModel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    
    // Select all info by department
    public List<ElderModel> selectAllByRoom(int id) throws Exception;
    
    // list: paged, department included, by condition
    // public List<ElderModel> selectListByConditionWithPageDepartment(
    //         @Param("start") int start, @Param("rows") int rows,
    //         @Param("startBirthday") Date startBirthday, @Param("endBirthday") Date endBirthday,
    //         @Param("startJoinDate") Date startJoinDate, @Param("sex") String sex,
    //         @Param("nameKey") String nameKey) throws Exception;
    
    
    // add hobbies
    //public void insertHobbies(@Param("id") String id, @Param("nos") List<Integer> nos) throws Exception;
}
