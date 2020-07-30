package com.thirteen.oph.doctor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.doctor.mapper.IIllnessMapper;
import com.thirteen.oph.doctor.model.IllnessModel;
import com.thirteen.oph.doctor.service.IIllnessService;

@Service("Illness")
@Transactional // around advice cutpoint
public class IllnessServiceImpl implements IIllnessService {
    
    @Autowired
    private IIllnessMapper deptMapper = null;

    @Override
    public void add(IllnessModel dm) throws Exception {
        deptMapper.insert(dm);
    }

    @Override
    public void modify(IllnessModel dm) throws Exception {
        deptMapper.update(dm);
    }

    @Override
    public void delete(IllnessModel dm) throws Exception {
        deptMapper.delete(dm);
    }

    @Override
    public IllnessModel getById(String id) throws Exception {
        return deptMapper.selectById(id);
    }

    @Override
    public List<IllnessModel> getListAll() throws Exception {
        return deptMapper.selectAll();
    }

    @Override
    public List<IllnessModel> getAllWithPage(int rows, int page) throws Exception {
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

