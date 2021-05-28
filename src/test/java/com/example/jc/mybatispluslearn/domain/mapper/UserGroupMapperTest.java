package com.example.jc.mybatispluslearn.domain.mapper;

import com.example.jc.mybatispluslearn.domain.UserGroup;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-24
 */
@SpringBootTest
@MapperScan("com.example.jc.mybatispluslearn.domain.mapper")
class UserGroupMapperTest {

    @Autowired
    private UserGroupMapper userGroupMapper;

    @Test
    void findById() {
        UserGroup userGroup = userGroupMapper.findUserGroupById(1L);
        assertNotNull(userGroup);
        assertNotNull(userGroup.getUserList());
    }
}