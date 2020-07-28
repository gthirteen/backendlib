package com.thirteen.oph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirteen.oph.pm.model.RoomModel;
import com.thirteen.oph.pm.service.IRoomService;
import com.thirteen.oph.restresult.Result;

@RestController
@RequestMapping(value="/room")
public class RoomController {

    @Autowired
    private IRoomService rs = null;
    
    @PostMapping(value="/add")
    public Result<String> add(@RequestBody RoomModel rm) throws Exception {
        rs.add(rm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody RoomModel rm) throws Exception {
        rs.modify(rm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody RoomModel rm) throws Exception {
        rs.delete(rm);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
}
