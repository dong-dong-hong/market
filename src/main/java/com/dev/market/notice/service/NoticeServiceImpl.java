package com.dev.market.notice.service;

import com.dev.market.notice.model.dao.NoticeDAO;
import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeInfoVO> selectNoticeInfoList() {
        return noticeDAO.selectNoticeInfoList();
    }

    @Override
    public NoticeInfoVO selectNoticeInfo(NoticeSelectRequestDTO noticeSelectRequestDTO) {
        return noticeDAO.selectNoticeInfo(noticeSelectRequestDTO);
    }

    @Override
    public Boolean insertNoticeInfo(NoticeInsertRequestDTO noticeInsertRequestDTO) {
        return noticeDAO.insertNoticeInfo(noticeInsertRequestDTO) == 1;
    }

    @Override
    public Boolean updateNoticeInfo(NoticeUpdateRequestDTO noticeUpdateRequestDTO) {
        return noticeDAO.updateNoticeInfo(noticeUpdateRequestDTO) == 1;
    }
}
