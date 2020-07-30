package com.thirteen.oph.doctor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.doctor.mapper.IDoctorMapper;
import com.thirteen.oph.doctor.model.DoctorModel;
import com.thirteen.oph.doctor.service.IDoctorService;

@Service("DoctorService")
@Transactional // around advice cutpoint
public class DoctorServiceImpl implements IDoctorService {
    
    @Autowired
    private IDoctorMapper deptMapper = null;

    @Override
    public void add(DoctorModel dm) throws Exception {
        deptMapper.insert(dm);
    }

    @Override
    public void modify(DoctorModel dm) throws Exception {
        deptMapper.update(dm);
    }

    @Override
    public void delete(DoctorModel dm) throws Exception {
        deptMapper.delete(dm);
    }

    @Override
    public DoctorModel getById(String id) throws Exception {
        return deptMapper.selectById(id);
    }

    @Override
    public List<DoctorModel> getListAll() throws Exception {
        return deptMapper.selectAll();
    }

    @Override
    public List<DoctorModel> getAllWithPage(int rows, int page) throws Exception {
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

