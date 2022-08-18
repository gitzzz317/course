package com.course.business.controller.admin;

import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;
import com.course.server.dto.ResponseDto;
import com.course.server.service.ChapterService;
import com.course.server.util.UuidUtil;
import com.course.server.util.ValidatorUtil;
import org.apache.ibatis.annotations.Delete;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);

    @Autowired
    private ChapterService chapterService;
    
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto ){
        LOG.info("pageDto:{}", pageDto);
        chapterService.list(pageDto);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @PostMapping("/save")
    public ResponseDto save(@RequestBody ChapterDto chapterDto ){
        LOG.info("ChapterDto:{}", chapterDto);
        // 保存校验
        ValidatorUtil.require(chapterDto.getName(), "名称");
        ValidatorUtil.require(chapterDto.getCourseId(), "课程ID");
        ValidatorUtil.length(chapterDto.getCourseId(), "课程ID", 1, 8);


        chapterService.save(chapterDto);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent(chapterDto);
        return responseDto;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable String id){
        LOG.info("id:{}", id);
        chapterService.delete(id);
        ResponseDto responseDto = new ResponseDto();
        return responseDto;
    }
}
