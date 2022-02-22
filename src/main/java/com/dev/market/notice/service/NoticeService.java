package com.dev.market.notice.service;

import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;

import java.util.List;

public interface NoticeService {
    List<NoticeInfoVO> selectNoticeInfoList();
    NoticeInfoVO selectNoticeInfo(NoticeSelectRequestDTO noticeSelectRequestDTO);
    Boolean insertNoticeInfo(NoticeInsertRequestDTO noticeInsertRequestDTO);
    Boolean updateNoticeInfo(NoticeUpdateRequestDTO noticeUpdateRequestDTO);
}
