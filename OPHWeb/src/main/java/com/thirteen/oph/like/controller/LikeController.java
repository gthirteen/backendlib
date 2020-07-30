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
import com.thirteen.oph.service.IDislikeService;
import com.thirteen.oph.restresult.Result;

@RestController
@CrossOrigin(origins = {"*", "null"})
@RequestMapping(value="/like")
public class LikeController {
    
    @Autowired
    private IBedService ds = null;
    
    @PostMapping(value="/add")
    public Result<String> add(@RequestBody DislikeModel dm) throws Exception {
    	System.out.println(dm.getId());
        ds.add(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody DislikeModel dm) throws Exception {
        ds.modify(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody DislikeModel dm) throws Exception {
        ds.delete(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
    @GetMapping(value="/list/all")
    public Result<DislikeModel> getListAll() throws Exception {
        Result<DislikeModel> res = new Result<DislikeModel>();
        res.setList(ds.getListAll());
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/getbyid")
    public Result<DislikeModel> getById(@RequestParam(required=true, value="id") String id) throws Exception {
        Result<BedModel> res = new Result<DislikeModel>();
        res.setResult(ds.getById(id));
        res.setStatus("OK");
        res.setMessage("Get By ID");
        return res;
    }
    
}