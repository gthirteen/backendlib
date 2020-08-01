package com.thirteen.oph.doctor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.doctor.model.DoctorModel;

@Mapper
public interface IDoctorMapper {
    
    // insert, update, delete
    public void insert(DoctorModel dm) throws Exception;
    public void update(DoctorModel dm) throws Exception;
    public void delete(DoctorModel dm) throws Exception;
    
    public DoctorModel selectById(String id) throws Exception;

    // select
    public List<DoctorModel> selectAll() throws Exception;
    // count and page
    public List<DoctorModel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    public int selectCountAll() throws Exception;
    
}
