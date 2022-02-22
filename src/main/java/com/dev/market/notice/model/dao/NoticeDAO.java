package com.dev.market.notice.model.dao;

import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDAO {
    List<NoticeInfoVO> selectNoticeInfoList();
    NoticeInfoVO selectNoticeInfo(NoticeSelectRequestDTO noticeSelectRequestDTO);
    Integer insertNoticeInfo(NoticeInsertRequestDTO noticeInsertRequestDTO);
    Integer updateNoticeInfo(NoticeUpdateRequestDTO noticeUpdateRequestDTO);
}
