package com.example.cache.mapper;

import com.example.cache.bean.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {
    @Select("select * from employee where id=#{id}")
    public Employee getEmpById(Integer id);

    @Update("update employee set lastName =#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public void updateEmp(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public void delEmp(Integer id);

    @Insert("insert into employee (lastName,email,gender,d_id) values (#{lastName},#{email},#{gender},#{dId})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insertEmp(Employee employee);
}
