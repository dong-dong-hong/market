package com.dev.market.faq.controller;

import com.dev.market.faq.model.dto.FaqInsertRequestDTO;
import com.dev.market.faq.model.dto.FaqSelectRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateStateRequestDTO;
import com.dev.market.faq.model.vo.FaqInfoVO;
import com.dev.market.faq.service.FaqService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"Faq API"})
@RequestMapping("/faq")
public class FaqController {

    @Autowired
    private FaqService faqService;

    @ApiOperation(value = "자주하는 질문 리스트 조회", notes = "자주하는 질문에 대한 정보 리스트를 조회하는 API입니다.")
    @GetMapping("/info/list")
    public List<FaqInfoVO> selectFaqInfoList() {
        return faqService.selectFaqInfoList();
    }

    @ApiOperation(value = "자주하는 질문 조회", notes = "자주하는 질문에 대한 정보를 조회하는 API입니다.")
    @GetMapping("/info")
    public FaqInfoVO selectFaqInfo(
            @ApiParam(name = "faqNo", value = "자주하는 질문 번호", required = true, example = "1")
            @RequestParam("faqNo") Long faqNo
    ) {
        FaqSelectRequestDTO faqSelectRequestDTO = new FaqSelectRequestDTO();
        faqSelectRequestDTO.setFaqNo(faqNo);

        return faqService.selectFaqInfo(faqSelectRequestDTO);
    }

    @ApiOperation(value = "자주하는 질문 삽입", notes = "자주하는 질문에 대한 정보를 삽입하는 API입니다.")
    @PostMapping("/info")
    public Boolean insertFaqInfo(
            @ApiParam(name = "faqInsertRequestDTO", value = "자주하는 질문 삽입 객체 정보", required = true)
            @RequestBody FaqInsertRequestDTO faqInsertRequestDTO
    ) {
        return faqService.insertFaqInfo(faqInsertRequestDTO);
    }

    @ApiOperation(value = "자주하는 질문 업데이트", notes = "자주하는 질문에 대한 정보를 업데이트하는 API입니다.")
    @PutMapping("/info")
    public Boolean updateFaqInfo(
            @ApiParam(name = "faqUpdateRequestDTO", value = "자주하는 질문 업데이트 객체 정보", required = true)
            @RequestBody FaqUpdateRequestDTO faqUpdateRequestDTO
    ) {
        return faqService.updateFaqInfo(faqUpdateRequestDTO);
    }

    @ApiOperation(value = "자주하는 질문 상태 업데이트", notes = "자주하는 질문 상태에 대한 정보를 업데이트하는 API입니다.")
    @PutMapping("/state")
    public Boolean updateFaqState(
            @ApiParam(name = "faqUpdateStateRequestDTO", value = "자주하는 질문 상태 업데이트 객체 정보", required = true)
            @RequestBody FaqUpdateStateRequestDTO faqUpdateStateRequestDTO
    ) {
        return faqService.updateFaqState(faqUpdateStateRequestDTO);
    }
}
