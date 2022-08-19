package com.course.server.mapper.my;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyCourseMapper {

    int updateTime(@Param("courseId") String courseId);

}
