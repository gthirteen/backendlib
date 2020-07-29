package com.thirteen.oph.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.hr.mapper.IDepartmentMapper;
import com.thirteen.oph.hr.model.DepartmentModel;
import com.thirteen.oph.hr.service.IDepartmentService;

@Service("DepartmentService")
@Transactional // around advice cutpoint
public class DepartmentServiceImpl implements IDepartmentService {
    
    @Autowired
    private IDepartmentMapper deptMapper = null;

    @Override
    public void add(DepartmentModel dm) throws Exception {
        deptMapper.insert(dm);
    }

    @Override
    public void modify(DepartmentModel dm) throws Exception {
        deptMapper.update(dm);
    }

    @Override
    public void delete(DepartmentModel dm) throws Exception {
        deptMapper.delete(dm);
    }

    @Override
    public DepartmentModel getById(String id) throws Exception {
        return deptMapper.selectById(id);
    }

    @Override
    public List<DepartmentModel> getListAll() throws Exception {
        return deptMapper.selectAll();
    }

    @Override
    public List<DepartmentModel> getAllWithPage(int rows, int page) throws Exception {
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
