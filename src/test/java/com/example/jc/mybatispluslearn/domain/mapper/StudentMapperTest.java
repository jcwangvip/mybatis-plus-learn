package com.example.jc.mybatispluslearn.domain.mapper;

import com.example.jc.mybatispluslearn.domain.Student;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-21
 */
@SpringBootTest
@MapperScan("com.example.jc.mybatispluslearn.domain.mapper")
class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void name() {
        Student student = studentMapper.findStudentById(1l);
        System.out.println(student);

    }
}