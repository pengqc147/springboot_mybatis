package com.pqc.spring_mybatis.controller;

import com.pqc.spring_mybatis.Mapper.DeparMapper;
import com.pqc.spring_mybatis.dao.DepartmentDao;
import com.pqc.spring_mybatis.entity.Depar;
import com.pqc.spring_mybatis.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/depar")
public class DeparController {
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private DeparMapper deparMapper;
    @Value("${page.rows}")
    private Integer rows;
    @RequestMapping("/deparList")
    public String showDeparList(Model model){
        List<Department> deparList = departmentDao.findAll();
        model.addAttribute("deparList",deparList);
        return "de";
    }
    @RequestMapping("/rows")
    @ResponseBody
    public Map shoeRows(){
        Map map = new HashMap();
        map.put("rows",rows);
        return map;
    }
    @RequestMapping("/getList")
    @ResponseBody
    public List<Depar> getList(){
        List<Depar> list = deparMapper.getList();
        System.out.println(list);
        return list;
    }
}
