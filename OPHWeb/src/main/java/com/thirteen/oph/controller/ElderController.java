package com.thirteen.oph.controller;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
    public Result<String> add(@RequestBody ElderModel em) throws Exception {
        es.add(em);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
        return res;
    }
    
    @PostMapping(value="/modify")
    public Result<String> modify(@RequestBody ElderModel em) throws Exception {
        es.modify(em);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record modified");
        return res;
    }
    
    @PostMapping(value="/delete")
    public Result<String> delete(@RequestBody ElderModel em) throws Exception {
        es.delete(em);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A record removed");
        return res;
    }
    
    @PostMapping(value="/addphoto")
    public Result<String> updatePhoto(ElderModel em, @RequestParam(required=true) String id, 
            @RequestParam(required=false) MultipartFile elderPhoto,
            HttpServletRequest request) throws Exception {
        if (elderPhoto!=null && !elderPhoto.isEmpty()) {
            String extension = null;
            int i = elderPhoto.getOriginalFilename().lastIndexOf('.');
            if (i > 0) {
                extension = elderPhoto.getOriginalFilename().substring(i+1);
            }
            File dist = new File("/home/ddkk/git/images/" + id + "." + extension);
            elderPhoto.transferTo(dist);
            em.setPhotoPath(id + "." + extension);
        } else {
            em.setPhotoPath(null);            
        }
        es.updatePhoto(em);
        Result<String> res = new Result<String>();
        res.setStatus("OK");
        res.setMessage("A new record added.");
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
        int cnt = es.getCountAll();
        res.setCount(cnt);
        res.setPageCount(cnt%rows!=0 ? cnt/rows+1 : cnt/rows);
        res.setStatus("OK");
        res.setMessage("Get paged list");
        return res;
    }
    
    @GetMapping(value="/getbycond")
    public Result<ElderModel> selectAllByCondition(
            @RequestParam(required=false, defaultValue="1") int page, 
            @RequestParam(required=false, defaultValue="10") int rows,
            @RequestParam(required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date startBirthday, 
            @RequestParam(required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date endBirthday,
            @RequestParam(required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date startJoinDate, 
            @RequestParam(required=false) String sex,
            @RequestParam(required=false) String roomid,
            @RequestParam(required=false) String nameKey) throws Exception {
        Result<ElderModel> res = new Result<ElderModel>();
        if (roomid!=null && roomid.isEmpty()) roomid=null;
        if (nameKey!=null && nameKey.isEmpty()) nameKey=null;
        res.setList(es.selectAllByCondition(page, rows, startBirthday, endBirthday, startJoinDate, sex, roomid, nameKey));
        int cnt = es.countAllByCondition(startBirthday, endBirthday, 
                startJoinDate, sex, roomid, nameKey);
        res.setCount(cnt);
        res.setPageCount(cnt%rows!=0 ? cnt/rows+1 : cnt/rows);
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
