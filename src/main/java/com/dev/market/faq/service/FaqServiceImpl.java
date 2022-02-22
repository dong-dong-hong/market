package com.dev.market.faq.service;

import com.dev.market.faq.model.dao.FaqDAO;
import com.dev.market.faq.model.dto.FaqInsertRequestDTO;
import com.dev.market.faq.model.dto.FaqSelectRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateStateRequestDTO;
import com.dev.market.faq.model.vo.FaqInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService{

    @Autowired
    private FaqDAO faqDAO;

    @Override
    public List<FaqInfoVO> selectFaqInfoList() {
        return faqDAO.selectFaqInfoList();
    }

    @Override
    public FaqInfoVO selectFaqInfo(FaqSelectRequestDTO faqSelectRequestDTO) {
        return faqDAO.selectFaqInfo(faqSelectRequestDTO);
    }

    @Override
    public Boolean insertFaqInfo(FaqInsertRequestDTO faqInsertRequestDTO) {
        return faqDAO.insertFaqInfo(faqInsertRequestDTO) == 1;
    }

    @Override
    public Boolean updateFaqInfo(FaqUpdateRequestDTO faqUpdateRequestDTO) {
        return faqDAO.updateFaqInfo(faqUpdateRequestDTO) == 1;
    }

    @Override
    public Boolean updateFaqState(FaqUpdateStateRequestDTO faqUpdateStateRequestDTO) {
        return faqDAO.updateFaqState(faqUpdateStateRequestDTO) == 1;
    }
}
