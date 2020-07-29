package com.thirteen.oph.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.hr.model.DepartmentModel;

@Mapper
public interface IDepartmentMapper {
    
    public void insert(DepartmentModel dm) throws Exception;
    public void update(DepartmentModel dm) throws Exception;
    public void delete(DepartmentModel dm) throws Exception;
    
    public DepartmentModel selectById(String id) throws Exception;
    
    // Select all info, Department and hobbies included
    public List<DepartmentModel> selectAll() throws Exception;
    public int selectCountAll() throws Exception;
    public List<DepartmentModel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    
}
