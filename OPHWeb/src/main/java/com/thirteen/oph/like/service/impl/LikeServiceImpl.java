package com.thirteen.oph.like.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.like.mapper.ILikeMapper;
import com.thirteen.oph.like.model.LikeMoudel;
import com.thirteen.oph.like.service.ILikeService;

@Service("LikeService")
@Transactional // around advice cutpoint
public class ILikeServiceImpl implements ILikeService {
    
    @Autowired
    private ILikeMapper deptMapper = null;

    @Override
    public void add(LikeMoudel dm) throws Exception {
        deptMapper.insert(dm);
    }

    @Override
    public void modify(LikeMoudel dm) throws Exception {
        deptMapper.update(dm);
    }

    @Override
    public void delete(LikeMoudel dm) throws Exception {
        deptMapper.delete(dm);
    }

    @Override
    public LikeMoudel getById(String id) throws Exception {
        return deptMapper.LikeMoudel(id);
    }

    @Override
    public List<LikeMoudel> getListAll() throws Exception {
        return deptMapper.LikeMoudel();
    }

    @Override
    public List<LikeMoudel> getAllWithPage(int rows, int page) throws Exception {
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