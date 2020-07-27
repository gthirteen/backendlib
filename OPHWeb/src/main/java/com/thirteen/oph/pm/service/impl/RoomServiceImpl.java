package com.thirteen.oph.pm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.pm.mapper.IRoomMapper;
import com.thirteen.oph.pm.model.RoomModel;
import com.thirteen.oph.pm.service.IRoomService;


@Service("RoomService")
@Transactional // around advice cutpoint
public class RoomServiceImpl implements IRoomService {
    @Autowired
    private IRoomMapper roomMapper = null;
    
    @Override
    public void add(RoomModel rm) throws Exception {
        roomMapper.insert(rm);
    }

    @Override
    public void modify(RoomModel rm) throws Exception {
        roomMapper.update(rm);
    }

    @Override
    public void delete(RoomModel rm) throws Exception {
        roomMapper.delete(rm);
    }

    @Override
    public List<RoomModel> getListAll() throws Exception {
        return roomMapper.selectAll();
    }

    @Override
    public RoomModel getById(String id) throws Exception {
        return roomMapper.selectById(id);
    }

    @Override
    public List<RoomModel> selectAllWithPage(int rows, int page) throws Exception {
        return roomMapper.selectAllWithPage(rows*(page-1), rows);
    }

    @Override
    public int selectCountAll() throws Exception {
        return roomMapper.selectCountAll();
    }
    
    @Override
    public int selectPageCountAll(int rows) throws Exception {
        int cnt = this.selectCountAll();
        if (cnt%rows!=0) {
            return cnt/rows + 1;
        } else {
            return cnt/rows;
        }
    }
    
}
