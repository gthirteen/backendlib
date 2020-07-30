package com.thirteen.oph.like.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thirteen.oph.like.model.DislikeMoudel;
import com.thirteen.oph.like.service.IDislikeService;
import com.thirteen.oph.*;
import com.thirteen.oph.restresult.Result;

@RestController
@CrossOrigin(origins = {"*", "null"})
@RequestMapping(value="/dislike")
public class DislikeController {
    
    @Autowired
    private IDislikeService ds = null;
    
    @PostMapping(value="/add")
    public Result<String> add(@RequestBody DislikeMoudel dm) throws Exception {
    	System.out.println(dm.getId());
        ds.add(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody DislikeMoudel dm) throws Exception {
        ds.modify(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody DislikeMoudel dm) throws Exception {
        ds.delete(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
    @GetMapping(value="/list/all")
    public Result<DislikeMoudel> getListAll() throws Exception {
        Result<DislikeMoudel> res = new Result<DislikeMoudel>();
        res.setList(ds.getListAll());
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/getbyid")
    public Result<DislikeMoudel> getById(@RequestParam(required=true, value="id") String id) throws Exception {
        Result<DislikeMoudel> res = new Result<DislikeMoudel>();
        res.setResult(ds.getById(id));
        res.setStatus("OK");
        res.setMessage("Get By ID");
        return res;
    }
    
}
