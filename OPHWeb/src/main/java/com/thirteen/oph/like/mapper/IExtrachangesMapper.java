package com.thirteen.oph.like.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.like.model.ExtrachangesMoudel;

@Mapper
public interface IExtrachangesMapper {
    
    // insert, update, delete
    public void insert(ExtrachangesMoudel dm) throws Exception;
    public void update(ExtrachangesMoudel dm) throws Exception;
    public void delete(ExtrachangesMoudel dm) throws Exception;
    
    public ExtrachangesMoudel selectById(String id) throws Exception;

    // select
    public List<ExtrachangesMoudel> selectAll() throws Exception;
    // count and page
    public List<ExtrachangesMoudel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    public int selectCountAll() throws Exception;
    
}
