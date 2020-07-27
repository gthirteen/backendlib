package com.thirteen.oph.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thirteen.oph.pm.model.RoomModel;

@Mapper
public interface IRoomMapper {
    
    // insert, update, delete
    public void insert(RoomModel dm) throws Exception;
    public void update(RoomModel dm) throws Exception;
    public void delete(RoomModel dm) throws Exception;
    
    public RoomModel selectById(String id) throws Exception;

    // select
    public List<RoomModel> selectAll() throws Exception;
    // count and page
    public List<RoomModel> selectAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
    public int selectCountAll() throws Exception;
    
}
