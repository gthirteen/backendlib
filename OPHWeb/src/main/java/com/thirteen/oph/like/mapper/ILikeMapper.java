package com.thirteen.oph.like.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.doctor.model.IllnessModel;
import com.thirteen.oph.like.model.LikeMoudel;

@Mapper
public interface ILikeMapper {
    
    // insert, update, delete
    public void insert(LikeMoudel dm) throws Exception;
    public void update(LikeMoudel dm) throws Exception;
    public void delete(LikeMoudel dm) throws Exception;
    
    public LikeMoudel selectById(String id) throws Exception;

    // select
    public List<LikeMoudel> selectAll() throws Exception;
    // count and page
    public List<LikeMoudel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    public int selectCountAll() throws Exception;
    
}
