package com.example.jc.mybatispluslearn.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 自动填充Handler
 *
 * @author jiancheng
 * @date 2021-5-19
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入时自动填充
     *
     * @param metaObject 元对象，就是方法的入参
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("insert开始属性填充");
        String name = "gmtCreate";
        strictInsertFill(metaObject, name);
        strictInsertFill(metaObject, "gmtModified");
        strictInsertFill(metaObject, "gmtModified");
        strictInsertFillByFedldType(metaObject, "deleted", Boolean.class, Boolean.FALSE);
    }

    private void strictInsertFillByFedldType(MetaObject metaObject, String name, Class fieldType, Object fieldVal) {
        boolean hasGmtCreate = metaObject.hasSetter(name);
        if (hasGmtCreate) {
            Object gmtCreate = this.getFieldValByName(name, metaObject);
            if (gmtCreate == null) {
                this.strictInsertFill(metaObject, name, fieldType, fieldVal);
            }
        }
    }

    private void strictInsertFill(MetaObject metaObject, String name) {
        boolean hasGmtCreate = metaObject.hasSetter(name);
        if (hasGmtCreate) {
            Object gmtCreate = this.getFieldValByName(name, metaObject);
            if (gmtCreate == null) {
                this.strictInsertFill(metaObject, name, LocalDateTime.class, LocalDateTime.now());
            }
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("update开始属性填充");
        strictInsertFill(metaObject, "gmtModified");
    }


}
