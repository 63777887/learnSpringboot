package com.example.exmybatis.mapper;

import com.example.exmybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    @Options(useGeneratedKeys = true ,keyProperty = "id")
    public void insertEmp(Employee employee);

}
