package com.example.jc.mybatispluslearn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.jc.mybatispluslearn.domain.Employee;
import com.example.jc.mybatispluslearn.domain.mapper.EmployeeMapper;
import com.example.jc.mybatispluslearn.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-19
 */
@Slf4j
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Override
    public List<Employee> listAllByLastName(String lastName) {
        return baseMapper.selectAllByLastName(lastName);
    }

}
