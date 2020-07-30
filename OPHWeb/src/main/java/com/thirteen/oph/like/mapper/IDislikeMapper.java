package com.thirteen.oph.like.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.like.model.DislikeMoudel;

@Mapper
public interface IDislikeMapper {
    
    // insert, update, delete
    public void insert(DislikeMoudel dm) throws Exception;
    public void update(DislikeMoudel dm) throws Exception;
    public void delete(DislikeMoudel dm) throws Exception;
    
    public DislikeMoudel selectById(String id) throws Exception;

    // select
    public List<DislikeMoudel> selectAll() throws Exception;
    // count and page
    public List<DislikeMoudel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    public int selectCountAll() throws Exception;
    
}
