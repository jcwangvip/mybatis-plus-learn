package com.example.jc.mybatispluslearn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.jc.mybatispluslearn.domain.Employee;

import java.util.List;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-19
 */
public interface EmployeeService extends IService<Employee> {

    List<Employee> listAllByLastName(String lastName);



}
