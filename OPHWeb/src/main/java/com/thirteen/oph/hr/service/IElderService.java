package com.thirteen.oph.hr.service;

import java.util.List;

import com.thirteen.oph.hr.model.ElderModel;


public interface IElderService {

    // add new employee, hobbies included.
    public void add(ElderModel em) throws Exception;
    public void modify(ElderModel em) throws Exception;
    public void delete(ElderModel em) throws Exception;

    public ElderModel getById(String id) throws Exception; 

    // get all, room info included
    public List<ElderModel> getListAll() throws Exception;
    public List<ElderModel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
    // Select all info by room, room info included
    public List<ElderModel> getAllByRoom(String id) throws Exception;
}
