package com.thirteen.oph.like.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.like.mapper.IDislikeMapper;
import com.thirteen.oph.like.model.DislikeMoudel;
import com.thirteen.oph.like.service.IDislikeService;

@Service("DislikeService")
@Transactional // around advice cutpoint
public class DislikeServiceImpl implements IDislikeService {
    
    @Autowired
    private IDislikeMapper deptMapper = null;

    @Override
    public void add(DislikeMoudel dm) throws Exception {
        deptMapper.insert(dm);
    }

    @Override
    public void modify(DislikeMoudel dm) throws Exception {
        deptMapper.update(dm);
    }

    @Override
    public void delete(DislikeMoudel dm) throws Exception {
        deptMapper.delete(dm);
    }

    @Override
    public DislikeMoudel getById(String id) throws Exception {
        return deptMapper.DislikeMoudel(id);
    }

    @Override
    public List<DislikeMoudel> getListAll() throws Exception {
        return deptMapper.DislikeMoudel();
    }

    @Override
    public List<DislikeMoudel> getAllWithPage(int rows, int page) throws Exception {
        return deptMapper.selectAllWithPage(rows*(page-1), rows);
    }

    @Override
    public int getCountAll() throws Exception {
        return deptMapper.selectCountAll();
    }

    @Override
    public int getPageCountAll(int rows) throws Exception {
        int cnt = this.getCountAll();
        if (cnt%rows!=0) {
            return cnt/rows + 1;
        } else {
            return cnt/rows;
        }
    }
    
}
