package com.course.server.mapper;

import com.course.server.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {

    List<Test> list();

}
