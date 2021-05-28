package com.example.jc.mybatispluslearn.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-21
 */
@Data
public class StudentClass {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String className;

}
