package com.example.cache.controller;

import com.example.cache.bean.Employee;
import com.example.cache.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/emp/{id}")
    public Employee selectEmp(@PathVariable Integer id){
        Employee employee = employeeService.selectEmpById(id);
        return employee;
    }

    @GetMapping("/delEmp/{id}")
    public String delEmp(@PathVariable Integer id){
        employeeService.delEmp(id);
        logger.info("删除成功");
        return "删除成功";
    }

    @GetMapping("/upEmp")
    public String updateEmp(Employee employee){
        employeeService.updateEmp(employee);
        logger.info("更新成功");
        return "更新成功";
    }

    @GetMapping("/emp")
    public Employee insertEmp(Employee employee){
        employeeService.insertEmp(employee);
        return employee;
    }

}
