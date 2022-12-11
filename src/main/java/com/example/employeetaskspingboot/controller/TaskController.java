package com.example.employeetaskspingboot.controller;

import com.example.employeetaskspingboot.dao.TaskDao;
import com.example.employeetaskspingboot.model.Task;
import com.example.employeetaskspingboot.model.Userregistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TaskController {
    @Autowired
    private TaskDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addtask",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addtask(@RequestBody Task t){
        System.out.println(t.getEmpcode());

        System.out.println(t.getTask().toString());


        HashMap<String,String> map=new HashMap<>();
        dao.save(t);
        map.put("status","success");
        return map;
    }
//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/getUserByempcode", consumes = "application/json", produces = "application/json")
//    public List<Task> GetUserById(@RequestBody Userregistration f){
//        return (List<Task>) dao.FindEmployee(f.getEmpcode());
//    }

}

