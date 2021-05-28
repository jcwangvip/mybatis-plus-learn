package com.example.jc.mybatispluslearn.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jc.mybatispluslearn.domain.UserGroup;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-24
 */
public interface UserGroupMapper extends BaseMapper<UserGroup> {

    @Results(id = "findById", value = {
            @Result(property = "userList", column = "id", many = @Many(fetchType = FetchType.LAZY, select = "com.example.jc.mybatispluslearn.domain.mapper.UserMapper.findUserByGroupUserId"))
    })
    @Select("select * from user_group where id = #{id}")
    UserGroup findUserGroupById(Long id);
}
