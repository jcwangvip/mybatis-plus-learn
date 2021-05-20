package com.example.jc.mybatispluslearn;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.example.jc.mybatispluslearn.domain.mapper")
class MybatisPlusLearnApplicationTests {

    @Test
    void contextLoads() {
    }

}
