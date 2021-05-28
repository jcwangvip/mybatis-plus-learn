package com.example.jc.mybatispluslearn.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-21
 */
@Data
@TableName("student")
public class Student {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    @TableField(exist = false)
    private StudentClass studentClass;

}
