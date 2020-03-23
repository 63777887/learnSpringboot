package com.example.cache.service;

import com.example.cache.bean.Employee;
import com.example.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.*;
//import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

//@CacheConfig(cacheNames = "emp")
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

//    @Qualifier("mycacheManager")
//    @Autowired
//    RedisCacheManager myRedisCacheManger;

    @Cacheable(value = {"emp"})
    public Employee selectEmpById(Integer id){
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }

    @CachePut(value = "emp",key = "#result.id")
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmp(employee);
        return employee;
    }

    @CacheEvict(value = "emp")
    public void delEmp(Integer id){
//        employeeMapper.delEmp(id);
    }


    public void insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
    }
}
