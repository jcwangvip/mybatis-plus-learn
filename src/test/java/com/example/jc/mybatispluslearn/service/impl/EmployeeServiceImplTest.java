package com.example.jc.mybatispluslearn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.jc.mybatispluslearn.domain.Employee;
import com.example.jc.mybatispluslearn.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-19
 */
@SpringBootTest
@MapperScan("com.example.jc.mybatispluslearn.domain.mapper")
class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void pageQueryWrapper() {
        Page<Employee> page = new Page<>(1, 2);
        employeeService.page(page, new QueryWrapper<Employee>()
                .between("age", 20, 50));
        List<Employee> employeeList = page.getRecords();
        employeeList.forEach(System.out::println);
    }

    @Test
    void page() {
        Page<Employee> page = new Page<>(1, 2);
        employeeService.page(page, null);
        List<Employee> employeeList = page.getRecords();
        employeeList.forEach(System.out::println);
        System.out.println("获取总条数:" + page.getTotal());
        System.out.println("获取当前页码:" + page.getCurrent());
        System.out.println("获取总页码:" + page.getPages());
        System.out.println("获取每页显示的数据条数:" + page.getSize());
        System.out.println("是否有上一页:" + page.hasPrevious());
        System.out.println("是否有下一页:" + page.hasNext());
    }

    @Test
    void removeById() {
        // 这里测试有可能过不了,是因为id写死了
        employeeService.removeById(1L);
    }

    @Test
    void updateAutoFillGmtModified() {
        // 这里测试有可能过不了,是因为id写死了
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setAge(30);

        employeeService.updateById(employee);
    }

    @Test
    void updateById() {
        // 这里测试有可能过不了,是因为id写死了
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setAge(30);

        employee.setGmtModified(LocalDateTime.now());

        employeeService.updateById(employee);
    }

    @Test
    void save() {
        Employee employee = new Employee();
        employee.setLastName("lisa");
        employee.setEmail("lisa@qq.com");
        employee.setAge(20);

        employee.setGmtCreate(LocalDateTime.now());
        employee.setGmtModified(LocalDateTime.now());

        employeeService.save(employee);
    }

    @Test
    void listAllByLastName() {
        List<Employee> list = employeeService.listAllByLastName("tom");
        list.forEach(System.out::println);
    }

    @Test
    void list() {
        List<Employee> list = employeeService.list();
        list.forEach(System.out::println);
    }

}