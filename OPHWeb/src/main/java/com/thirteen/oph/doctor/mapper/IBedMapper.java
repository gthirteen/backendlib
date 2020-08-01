package com.thirteen.oph.doctor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.doctor.model.BedModel;

@Mapper
public interface IBedMapper {
    
    // insert, update, delete
    public void insert(BedModel dm) throws Exception;
    public void update(BedModel dm) throws Exception;
    public void delete(BedModel dm) throws Exception;
    
    public BedModel selectById(String id) throws Exception;

    // select
    public List<BedModel> selectAll() throws Exception;
    // count and page
    public List<BedModel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    public int selectCountAll() throws Exception;
    
}
