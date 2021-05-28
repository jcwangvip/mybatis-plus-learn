package com.example.jc.mybatispluslearn.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jc.mybatispluslearn.domain.Student;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-5-21
 */
public interface StudentMapper extends BaseMapper<Student> {


    /**
     * 级联查询
     *
     * @param id
     * @return
     */
    @Results(id = "stuMap", value = {
//            @Result(property = "className", column = "class_name"),
            @Result(property = "studentClass", column = "id", one = @One(select = "com.example.jc.mybatispluslearn.domain.mapper.StudentClassMapper.selectById"))
//            @Result(property = "studentClass", column = "id", one = @One(fetchType = FetchType.LAZY, select = "com.example.jc.mybatispluslearn.domain.mapper.StudentClassMapper.selectById"))
    })
    @Select("SELECT * FROM STUDENT WHERE ID=#{id}")
    Student findStudentById(Long id);

}
