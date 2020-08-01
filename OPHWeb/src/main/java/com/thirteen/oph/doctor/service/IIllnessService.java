package com.thirteen.oph.doctor.service;

import java.util.List;

import com.thirteen.oph.doctor.model.IllnessModel;

public interface IIllnessService {
    // add new dmployee, hobbies included.
    public void add(IllnessModel dm) throws Exception;
    public void modify(IllnessModel dm) throws Exception;
    public void delete(IllnessModel dm) throws Exception;

    public IllnessModel getById(String id) throws Exception; 

    // get all, hobbies and department included
    public List<IllnessModel> getListAll() throws Exception;
    public List<IllnessModel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
}

