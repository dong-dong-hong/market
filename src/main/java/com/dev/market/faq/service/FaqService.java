package com.dev.market.faq.service;

import com.dev.market.faq.model.dto.FaqInsertRequestDTO;
import com.dev.market.faq.model.dto.FaqSelectRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateStateRequestDTO;
import com.dev.market.faq.model.vo.FaqInfoVO;

import java.util.List;

public interface FaqService {
    List<FaqInfoVO> selectFaqInfoList();
    FaqInfoVO selectFaqInfo(FaqSelectRequestDTO faqSelectRequestDTO);
    Boolean insertFaqInfo(FaqInsertRequestDTO faqInsertRequestDTO);
    Boolean updateFaqInfo(FaqUpdateRequestDTO faqUpdateRequestDTO);
    Boolean updateFaqState(FaqUpdateStateRequestDTO faqUpdateStateRequestDTO);
}
