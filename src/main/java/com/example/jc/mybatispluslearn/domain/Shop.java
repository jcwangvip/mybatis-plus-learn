package com.example.jc.mybatispluslearn.domain;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-20
 */
@Data
public class Shop {
    private Long id;
    private String name;
    private Integer price;
    @Version
    private Integer version;
}
