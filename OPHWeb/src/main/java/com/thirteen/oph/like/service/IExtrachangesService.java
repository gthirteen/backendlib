package com.thirteen.oph.like.service;

import java.util.List;

import com.thirteen.oph.like.model.ExtrachangesMoudel;;

public interface IExtrachangesService {
    // add new dmployee, hobbies included.
    public void add(ExtrachangesMoudel dm) throws Exception;
    public void modify(ExtrachangesMoudel dm) throws Exception;
    public void delete(ExtrachangesMoudel dm) throws Exception;

    public ExtrachangesMoudel getById(String id) throws Exception; 

    // get all, hobbies and department included
    public List<ExtrachangesMoudel> getListAll() throws Exception;
    public List<ExtrachangesMoudel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
}

