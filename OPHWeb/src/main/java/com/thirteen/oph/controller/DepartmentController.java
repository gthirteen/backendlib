package com.thirteen.oph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thirteen.oph.hr.model.DepartmentModel;
import com.thirteen.oph.hr.service.IDepartmentService;
import com.thirteen.oph.restresult.Result;

@RestController
@CrossOrigin(origins = {"*", "null"})
@RequestMapping(value="/department")
public class DepartmentController {
    
    @Autowired
    private IDepartmentService ds = null;
    
    @PostMapping(value="/add")
    public Result<String> add(@RequestBody DepartmentModel dm) throws Exception {
        ds.add(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody DepartmentModel dm) throws Exception {
        ds.modify(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody DepartmentModel dm) throws Exception {
        ds.delete(dm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
    @GetMapping(value="/list/all")
    public Result<DepartmentModel> getListAll() throws Exception {
        Result<DepartmentModel> res = new Result<DepartmentModel>();
        res.setList(ds.getListAll());
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/list/all/page")
    public Result<DepartmentModel> getAllWithPage(@RequestParam(required=true) int rows,
            @RequestParam(required=true) int page) throws Exception {
        Result<DepartmentModel> res = new Result<DepartmentModel>();
        res.setList(ds.getAllWithPage(rows, page));
        res.setCount(ds.getCountAll());
        res.setPageCount(ds.getPageCountAll(rows));
        res.setStatus("OK");
        res.setMessage("Get list");
        return res;
    }
    
    @GetMapping(value="/getbyid")
    public Result<DepartmentModel> getById(@RequestParam(required=true) String id) throws Exception {
        Result<DepartmentModel> res = new Result<DepartmentModel>();
        res.setResult(ds.getById(id));
        res.setStatus("OK");
        res.setMessage("Get By ID");
        return res;
    }
    
}
