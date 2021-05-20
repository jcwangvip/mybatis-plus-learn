package com.example.jc.mybatispluslearn.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.jc.mybatispluslearn.domain.Employee;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-19
 */
@SpringBootTest
@MapperScan("com.example.jc.mybatispluslearn.domain.mapper")
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void UpdateWrapper() {
        UpdateWrapper<Employee> wrapper = new UpdateWrapper<Employee>()
                .set("age", 50)
                .set("email", "emp@163.com")
                .like("last_name", "j")
                .gt("age", 20);
        employeeMapper.update(null, wrapper);
    }

    @Test
    void LambdaQueryWrapper() {
        // LambdaQueryWrapper 的好处是非硬编码,编译器发现问题
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<Employee>()
                .like(Employee::getLastName, "j")
                .gt(Employee::getAge, 20)
                .isNotNull(Employee::getEmail);
        List<Employee> list = employeeMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

    @Test
    void queryWrapperChain() {
        QueryWrapper<Employee> wrapper = new QueryWrapper<Employee>()
                .likeLeft("last_name", "j")
                .gt("age", 20)
                .isNotNull("email");
        List<Employee> list = employeeMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

    @Test
    void queryWrapper() {
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        // likeRight and likeLeft
        wrapper.like("last_name", "j");
        wrapper.gt("age", 20);
        wrapper.isNotNull("email");
        List<Employee> list = employeeMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

    @Test
    void deleteById() {
        Employee employee = new Employee();
        employee.setId(2L);
        employeeMapper.deleteById(employee);
    }

    @Test
    void update() {
        Employee employee = new Employee();
        employee.setId(2L);
        employeeMapper.updateById(employee);
    }

    @Test
    void save() {
        Employee employee = new Employee();
        employee.setLastName("lisa");
        employee.setEmail("lisa@qq.com");
        employee.setAge(20);

        employeeMapper.insert(employee);
    }

    @Test
    void selectList() {
        List<Employee> employees = employeeMapper.selectList(null);
        employees.forEach(System.out::println);
    }
}