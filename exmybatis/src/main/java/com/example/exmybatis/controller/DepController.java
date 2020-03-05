package com.example.exmybatis.controller;

import com.example.exmybatis.bean.Department;
import com.example.exmybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dep/{id}")
    public Department getDepartment(@PathVariable Integer id){
        return departmentMapper.getDepById(id);
    }

    @GetMapping("/dep")
    public Department insertDep(Department department){
        departmentMapper.insertDep(department);
        return department;
    }

    @GetMapping("/delDep/{id}")
    public int deleteDep(@PathVariable Integer id){
        departmentMapper.deleteDepById(id);
        return id;
    }

    @GetMapping("/updateDep")
    public Department updateDep(Department department){
        departmentMapper.updateDep(department);
        return department;
    }
}
