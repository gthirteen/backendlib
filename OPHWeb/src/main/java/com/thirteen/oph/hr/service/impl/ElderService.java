package com.thirteen.oph.hr.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirteen.oph.hr.model.ElderModel;
import com.thirteen.oph.hr.service.IElderService;

@Service("ElderService")
@Transactional // around advice cutpoint
public class ElderService implements IElderService {

    @Override
    public void add(ElderModel em) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void modify(ElderModel em) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(ElderModel em) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public ElderModel getById(String id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ElderModel> getListAll() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ElderModel> getAllWithPage(int rows, int page) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getCountAll() throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getPageCountAll(int rows) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<ElderModel> getAllByRoom(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
