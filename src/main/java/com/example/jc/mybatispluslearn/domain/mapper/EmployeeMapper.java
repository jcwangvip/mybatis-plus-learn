package com.example.jc.mybatispluslearn.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jc.mybatispluslearn.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * mybatis-plus Mapper
 *
 * @author jiancheng
 * @date 2021-5-19
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> selectAllByLastName(@Param("lastName") String lastName);

}
