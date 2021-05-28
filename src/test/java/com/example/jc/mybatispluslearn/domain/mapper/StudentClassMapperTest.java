package com.example.jc.mybatispluslearn.domain.mapper;

import com.example.jc.mybatispluslearn.domain.StudentClass;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-21
 */
@SpringBootTest
@MapperScan("com.example.jc.mybatispluslearn.domain.mapper")
class StudentClassMapperTest {

    @Autowired
    private StudentClassMapper studentClassMapper;

    @Test
    void name() {
        List<StudentClass> studentClasses = studentClassMapper.selectList(null);
        assertTrue(!studentClasses.isEmpty());
    }
}