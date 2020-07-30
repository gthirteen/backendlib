package com.thirteen.oph.doctor.service;

import java.util.List;

import com.thirteen.oph.doctor.model.DoctorModel;

public interface IDoctorService {
    // add new dmployee, hobbies included.
    public void add(DoctorModel dm) throws Exception;
    public void modify(DoctorModel dm) throws Exception;
    public void delete(DoctorModel dm) throws Exception;

    public DoctorModel getById(String id) throws Exception; 

    // get all, hobbies and department included
    public List<DoctorModel> getListAll() throws Exception;
    public List<DoctorModel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
}

