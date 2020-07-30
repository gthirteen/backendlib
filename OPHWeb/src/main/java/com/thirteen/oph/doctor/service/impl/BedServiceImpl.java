package com.thirteen.oph.doctor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.doctor.mapper.IBedMapper;
import com.thirteen.oph.doctor.model.BedModel;
import com.thirteen.oph.doctor.service.IBedService;

@Service("BedService")
@Transactional // around advice cutpoint
public class BedServiceImpl implements IBedService {
    
    @Autowired
    private IBedMapper deptMapper = null;

    @Override
    public void add(BedModel dm) throws Exception {
        deptMapper.insert(dm);
    }

    @Override
    public void modify(BedModel dm) throws Exception {
        deptMapper.update(dm);
    }

    @Override
    public void delete(BedModel dm) throws Exception {
        deptMapper.delete(dm);
    }

    @Override
    public BedModel getById(String id) throws Exception {
        return deptMapper.selectById(id);
    }

    @Override
    public List<BedModel> getListAll() throws Exception {
        return deptMapper.selectAll();
    }

    @Override
    public List<BedModel> getAllWithPage(int rows, int page) throws Exception {
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

