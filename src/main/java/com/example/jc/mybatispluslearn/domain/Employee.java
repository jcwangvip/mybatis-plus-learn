package com.example.jc.mybatispluslearn.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 员工表
 * <p>
 * 加Serializable 是用mapper删除的时候用的，要不报异常
 *
 * @author jiancheng
 * @date 2021-5-19
 */
@Data
@TableName("tbl_employee")
public class Employee implements Serializable {


    @TableId(type = IdType.AUTO)
    private Long id;
    private String lastName;
    private String email;
    private Integer age;
    /**
     * 插入的时候自动填充数据
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime gmtCreate;
    /**
     * 插入和更新的时候自动填充数据
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModified;
    /**
     * 逻辑删除属性
     */
//    @TableLogic
    @TableField(value = "is_deleted", fill = FieldFill.INSERT)
    private Boolean deleted;

}
