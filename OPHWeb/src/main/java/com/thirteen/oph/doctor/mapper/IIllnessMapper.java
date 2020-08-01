package com.thirteen.oph.doctor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.doctor.model.IllnessModel;

@Mapper
public interface IIllnessMapper {
    
    // insert, update, delete
    public void insert(IllnessModel dm) throws Exception;
    public void update(IllnessModel dm) throws Exception;
    public void delete(IllnessModel dm) throws Exception;
    
    public IllnessModel selectById(String id) throws Exception;

    // select
    public List<IllnessModel> selectAll() throws Exception;
    // count and page
    public List<IllnessModel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    public int selectCountAll() throws Exception;
    
}
