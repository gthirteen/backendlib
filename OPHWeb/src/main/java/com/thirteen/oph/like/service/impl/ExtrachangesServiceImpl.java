package com.thirteen.oph.like.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.like.mapper.IExtrachangesMapper;
import com.thirteen.oph.like.model.ExtrachangesMoudel;
import com.thirteen.oph.like.service.IExtrachangesService;

@Service("ExtrachangesService")
@Transactional // around advice cutpoint
public class ExtrachangesServiceImpl implements IExtrachangesService {
    
    @Autowired
    private IExtrachangesMapper deptMapper = null;

    @Override
    public void add(ExtrachangesMoudel dm) throws Exception {
        deptMapper.insert(dm);
    }

    @Override
    public void modify(ExtrachangesMoudel dm) throws Exception {
        deptMapper.update(dm);
    }

    @Override
    public void delete(ExtrachangesMoudel dm) throws Exception {
        deptMapper.delete(dm);
    }

    @Override
    public ExtrachangesMoudel getById(String id) throws Exception {
        return deptMapper.ExtrachangesMoudel(id);
    }

    @Override
    public List<ExtrachangesMoudel> getListAll() throws Exception {
        return deptMapper.ExtrachangesMoudel();
    }

    @Override
    public List<ExtrachangesMoudel> getAllWithPage(int rows, int page) throws Exception {
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