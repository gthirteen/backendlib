package com.thirteen.oph.like.service;

import java.util.List;

import com.thirteen.oph.like.model.DislikeMoudel;;

public interface IDislikeService {
    // add new dmployee, hobbies included.
    public void add(DislikeMoudel dm) throws Exception;
    public void modify(DislikeMoudel dm) throws Exception;
    public void delete(DislikeMoudel dm) throws Exception;

    public DislikeMoudel getById(String id) throws Exception; 

    // get all, hobbies and department included
    public List<DislikeMoudel> getListAll() throws Exception;
    public List<DislikeMoudel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
}

