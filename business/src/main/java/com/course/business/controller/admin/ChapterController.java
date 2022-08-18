package com.course.business.controller.admin;

import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;
import com.course.server.service.ChapterService;
import com.course.server.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);

    @Autowired
    private ChapterService chapterService;
    
    @PostMapping("/list")
    public PageDto list(@RequestBody PageDto pageDto ){
        chapterService.list(pageDto);
        return pageDto;
    }

    @PostMapping("/save")
    public void save(@RequestBody ChapterDto chapterDto ){
        LOG.info("ChapterDto:{}", chapterDto);
        chapterDto.setId(UuidUtil.getShortUuid());
        chapterService.save(chapterDto);
    }
}
