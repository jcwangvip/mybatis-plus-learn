package com.example.jc.mybatispluslearn.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jc.mybatispluslearn.domain.User;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-24
 */
public interface UserMapper extends BaseMapper<User> {


    User findUserByGroupUserId(Long groupUserId);

}
