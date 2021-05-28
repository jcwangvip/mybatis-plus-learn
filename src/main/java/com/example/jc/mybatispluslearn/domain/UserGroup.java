package com.example.jc.mybatispluslearn.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-24
 */
@Data
public class UserGroup {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String groupName;
    @TableField(exist = false)
    private List<User> userList;
}
