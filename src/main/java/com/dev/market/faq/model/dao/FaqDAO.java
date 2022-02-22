package com.dev.market.faq.model.dao;

import com.dev.market.faq.model.dto.FaqInsertRequestDTO;
import com.dev.market.faq.model.dto.FaqSelectRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateStateRequestDTO;
import com.dev.market.faq.model.vo.FaqInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaqDAO{
    List<FaqInfoVO> selectFaqInfoList();
    FaqInfoVO selectFaqInfo(FaqSelectRequestDTO faqSelectRequestDTO);
    Integer insertFaqInfo(FaqInsertRequestDTO faqInsertRequestDTO);
    Integer updateFaqInfo(FaqUpdateRequestDTO faqUpdateRequestDTO);
    Integer updateFaqState(FaqUpdateStateRequestDTO faqUpdateStateRequestDTO);
}
