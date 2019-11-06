package com.pqc.spring_mybatis.controller;

import com.pqc.spring_mybatis.dao.DepartmentDao;
import com.pqc.spring_mybatis.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/depar")
public class DepartmentController {

    @Autowired
    private DepartmentDao departmentDao;
    @RequestMapping("/list")
    public List<Department> getDepartmentList(Model model){
        return departmentDao.findAll();
    }


}
