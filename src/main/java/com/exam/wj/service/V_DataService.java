package com.exam.wj.service;

import com.exam.wj.dao.V_DataDAO;
import com.exam.wj.pojo.Category;
import com.exam.wj.pojo.V_Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class V_DataService {
    @Autowired
    V_DataDAO v_dataDAO;
    @Autowired
    CategoryService categoryService;

    public List<V_Data> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return v_dataDAO.findAll(sort);
    }
    public void addOrUpdate(V_Data v_data) {
        v_dataDAO.save(v_data);
    }

    public void deleteById(int id) {
        v_dataDAO.deleteById(id);
    }

}
