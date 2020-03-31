package com.exam.wj.controller;

import com.exam.wj.pojo.Book;
import com.exam.wj.pojo.V_Data;
import com.exam.wj.service.V_DataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowDataController {
    @Autowired
    V_DataService v_dataService;

    @CrossOrigin
    @GetMapping("/api/v_data")
    public List<V_Data> list() throws Exception {
        return v_dataService.list();
    }

    @CrossOrigin
    @PostMapping("/api/v_data")
    public V_Data addOrUpdate(@RequestBody V_Data v_data) throws Exception {
        v_dataService.addOrUpdate(v_data);
        return v_data;
    }

    @CrossOrigin
    @PostMapping("/api/v_delete")
    public void delete(@RequestBody V_Data v_data) throws Exception {
        v_dataService.deleteById(v_data.getId());
    }


}
