package com.thirteen.oph.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thirteen.oph.doctor.model.BedModel;
import com.thirteen.oph.doctor.service.IBedService;
import com.thirteen.oph.restresult.Result;

@RestController
@CrossOrigin(origins = {"*", "null"})
@RequestMapping(value="/bed")
public class BedController {
    
    @Autowired
    private IBedService ds = null;
    
    @PostMapping(value="/add")
    public Result<String> add(@RequestBody BedModel dm) throws Exception {
    	System.out.println(dm.getId());
        ds.add(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody BedModel dm) throws Exception {
        ds.modify(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody BedModel dm) throws Exception {
        ds.delete(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
    @GetMapping(value="/list/all")
    public Result<BedModel> getListAll() throws Exception {
        Result<BedModel> res = new Result<BedModel>();
        res.setList(ds.getListAll());
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/getbyid")
    public Result<BedModel> getById(@RequestParam(required=true, value="id") String id) throws Exception {
        Result<BedModel> res = new Result<BedModel>();
        res.setResult(ds.getById(id));
        res.setStatus("OK");
        res.setMessage("Get By ID");
        return res;
    }
    
}
