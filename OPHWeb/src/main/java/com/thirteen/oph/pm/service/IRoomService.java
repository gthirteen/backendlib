package com.thirteen.oph.pm.service;

import java.util.List;

import com.thirteen.oph.pm.model.RoomModel;

public interface IRoomService {
    
    public void add(RoomModel dm) throws Exception;
    public void modify(RoomModel dm) throws Exception;
    public void delete(RoomModel dm) throws Exception;
    
    public List<RoomModel> getListAll() throws Exception;
    public RoomModel getById(String id) throws Exception;
    
    public List<RoomModel> selectAllWithPage(int rows, int page) throws Exception;
    public int selectCountAll() throws Exception;
    public int selectPageCountAll(int rows) throws Exception;
}
