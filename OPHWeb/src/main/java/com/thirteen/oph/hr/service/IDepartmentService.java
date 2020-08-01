package com.thirteen.oph.hr.service;

import java.util.List;

import com.thirteen.oph.hr.model.DepartmentModel;

public interface IDepartmentService {
    // add new dmployee, hobbies included.
    public void add(DepartmentModel dm) throws Exception;
    public void modify(DepartmentModel dm) throws Exception;
    public void delete(DepartmentModel dm) throws Exception;
    
    public DepartmentModel getById(String id) throws Exception; 

    // get all, hobbies and department included
    public List<DepartmentModel> getListAll() throws Exception;
    public List<DepartmentModel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
}
