package com.thirteen.oph.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thirteen.oph.doctor.model.DoctorModel;
import com.thirteen.oph.doctor.service.IDoctorService;
import com.thirteen.oph.restresult.Result;

@RestController
@CrossOrigin(origins = {"*", "null"})
@RequestMapping(value="/doctor")
public class DoctorController {
    
    @Autowired
    private IDoctorService ds = null;
    
    @PostMapping(value="/add")
    public Result<String> add(@RequestBody DoctorModel dm) throws Exception {
    	System.out.println(dm.getId());
        ds.add(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody DoctorModel dm) throws Exception {
        ds.modify(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody DoctorModel dm) throws Exception {
        ds.delete(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
    @GetMapping(value="/list/all")
    public Result<DoctorModel> getListAll() throws Exception {
        Result<DoctorModel> res = new Result<DoctorModel>();
        res.setList(ds.getListAll());
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/getbyid")
    public Result<DoctorModel> getById(@RequestParam(required=true, value="id") String id) throws Exception {
        Result<DoctorModel> res = new Result<DoctorModel>();
        res.setResult(ds.getById(id));
        res.setStatus("OK");
        res.setMessage("Get By ID");
        return res;
    }
    
}
