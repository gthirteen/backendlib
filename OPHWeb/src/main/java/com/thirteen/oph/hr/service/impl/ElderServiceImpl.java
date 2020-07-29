package com.thirteen.oph.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.hr.mapper.IElderMapper;
import com.thirteen.oph.hr.model.ElderModel;
import com.thirteen.oph.hr.service.IElderService;

@Service("ElderService")
@Transactional // around advice cutpoint
public class ElderServiceImpl implements IElderService {
    
    @Autowired
    private IElderMapper elderMapper = null;

    @Override
    public void add(ElderModel em) throws Exception {
        elderMapper.insert(em);
    }

    @Override
    public void modify(ElderModel em) throws Exception {
        elderMapper.update(em);
    }

    @Override
    public void delete(ElderModel em) throws Exception {
        elderMapper.delete(em);
    }

    @Override
    public ElderModel getById(String id) throws Exception {
        return elderMapper.selectById(id);
    }

    @Override
    public List<ElderModel> getListAll() throws Exception {
        return elderMapper.selectAll();
    }

    @Override
    public List<ElderModel> getAllWithPage(int rows, int page) throws Exception {
        return elderMapper.selectAllWithPage((page-1)*rows, rows);
    }

    @Override
    public int getCountAll() throws Exception {
        return elderMapper.selectCountAll();
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

    @Override
    public List<ElderModel> getAllByRoom(String id) throws Exception {
        return elderMapper.selectAllByRoom(id);
    }

}
