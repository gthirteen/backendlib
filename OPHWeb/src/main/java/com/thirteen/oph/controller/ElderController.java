package com.thirteen.oph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thirteen.oph.hr.model.ElderModel;
import com.thirteen.oph.hr.service.IElderService;
import com.thirteen.oph.restresult.Result;

@RestController
@CrossOrigin(origins = {"*", "null"})
@RequestMapping(value="/elder")
public class ElderController {
    
    @Autowired
    private IElderService es = null;
    
    @PostMapping(value="/add")
    public Result<String> add(@RequestBody ElderModel dm) throws Exception {
        es.add(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody ElderModel dm) throws Exception {
        es.modify(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody ElderModel dm) throws Exception {
        es.delete(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
    @GetMapping(value="/list/all")
    public Result<ElderModel> getListAll() throws Exception {
        Result<ElderModel> res = new Result<ElderModel>();
        res.setList(es.getListAll());
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/list/all/page")
    public Result<ElderModel> getAllWithPage(@RequestParam(required=true) int rows,
            @RequestParam(required=true) int page) throws Exception {
        Result<ElderModel> res = new Result<ElderModel>();
        res.setList(es.getAllWithPage(rows, page));
        res.setCount(es.getCountAll());
        res.setPageCount(es.getPageCountAll(rows));
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/getbyid")
    public Result<ElderModel> getById(@RequestParam(required=true, value="id") String id) throws Exception {
        Result<ElderModel> res = new Result<ElderModel>();
        res.setResult(es.getById(id));
        res.setStatus("OK");
        res.setMessage("Get By ID");
        return res;
    }
    
    @GetMapping(value="/get/all/room")
    public Result<ElderModel> getAllByRoom(@RequestParam(required=true, value="id") String id) throws Exception {
        Result<ElderModel> res = new Result<ElderModel>();
        res.setList(es.getAllByRoom(id));
        res.setStatus("OK");
        res.setMessage("Get By ID");
        return res;
    }
    
}
