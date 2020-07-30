package com.thirteen.oph.like.service;

import java.util.List;

import com.thirteen.oph.like.model.LikeMoudel;

public interface ILikeService {
    // add new dmployee, hobbies included.
    public void add(LikeMoudel dm) throws Exception;
    public void modify(LikeMoudel dm) throws Exception;
    public void delete(LikeMoudel dm) throws Exception;

    public LikeMoudel getById(String id) throws Exception; 

    // get all, hobbies and department included
    public List<LikeMoudel> getListAll() throws Exception;
    public List<LikeMoudel> getAllWithPage(int rows, int page) throws Exception;
    public int getCountAll() throws Exception;
    public int getPageCountAll(int rows) throws Exception;
    
}

