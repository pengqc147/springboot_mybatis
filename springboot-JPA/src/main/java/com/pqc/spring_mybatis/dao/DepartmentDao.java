package com.pqc.spring_mybatis.dao;

import com.pqc.spring_mybatis.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department,Integer> {


}
