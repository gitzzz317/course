package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.mapper.ChapterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    @Autowired
    private ChapterMapper chapterMapper;

    public List<Chapter> list(){
        return chapterMapper.selectByExample(null);
    }
}
