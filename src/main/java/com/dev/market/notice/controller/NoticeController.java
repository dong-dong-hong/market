package com.dev.market.notice.controller;

import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;
import com.dev.market.notice.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"Notice API"})
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @ApiOperation(value = "공지사항 리스트 조회", notes = "공지사항 리스트를 조회하는 API입니다.")
    @GetMapping("/info/list")
    public List<NoticeInfoVO> selectNoticeInfoList() {
        return noticeService.selectNoticeInfoList();
    }

    @ApiOperation(value = "공지사항 조회", notes = "공지사항에 대한 정보를 조회하는 API입니다.")
    @GetMapping("/info")
    public NoticeInfoVO selectNoticeInfo(
            @ApiParam(name = "noticeNo", value = "공지사항 번호", required = true, example = "1")
            @RequestParam("noticeNo") Long noticeNo
    ) {
        NoticeSelectRequestDTO noticeSelectRequestDTO = new NoticeSelectRequestDTO();
        noticeSelectRequestDTO.setNoticeNo(noticeNo);

        return noticeService.selectNoticeInfo(noticeSelectRequestDTO);
    }

    @ApiOperation(value = "공지사항 삽입", notes = "공지사항에 대한 정보를 삽입하는 API입니다.")
    @PostMapping("/info")
    public Boolean insertNoticedInfo(
            @ApiParam(name = "noticeInsertRequestDTO", value = "공지사항 삽입 객체 정보", required = true)
            @RequestBody NoticeInsertRequestDTO noticeInsertRequestDTO
    ) {
        return noticeService.insertNoticeInfo(noticeInsertRequestDTO);
    }

    @ApiOperation(value = "공지사항 업데이트", notes = "공지사항에 대한 정보를 업데이트하는 API입니다.")
    @PutMapping("/info")
    public Boolean updateNoticeInfo(
            @ApiParam(name = "noticeUpdateRequestDTO", value = "공지사항 업데이트 객체 정보", required = true)
            @RequestBody NoticeUpdateRequestDTO noticeUpdateRequestDTO
    ) {
        return noticeService.updateNoticeInfo(noticeUpdateRequestDTO);
    }
}
