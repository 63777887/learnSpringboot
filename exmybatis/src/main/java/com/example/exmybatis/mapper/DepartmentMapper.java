package com.example.exmybatis.mapper;

import com.example.exmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id =#{id}")
    public Department getDepById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDepById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")    //让自增主键自动加入到bean类成员中
    @Insert("insert into department(departmentName) values (#{departmentName})")
    public int insertDep(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDep(Department department);
}
