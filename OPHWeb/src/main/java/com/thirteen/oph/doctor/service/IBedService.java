package com.thirteen.oph.doctor.service;

import java.util.List;

import com.thirteen.oph.doctor.model.BedModel;

public interface IBedService {
    // add new dmployee, hobbies included.
    public void add(BedModel dm) throws Exception;
    public void modify(BedModel dm) throws Exception;
    public void delete(BedModel dm) throws Exception;

    public BedModel getById(String id) throws Exception; 

    // get all, hobbies and department included
    public List<BedModel> getListAll() throws Exception;
    public List<BedModel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
}

