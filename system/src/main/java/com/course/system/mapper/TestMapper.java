package com.course.system.mapper;

import com.course.system.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {

    List<Test> list();

}
