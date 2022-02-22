package com.dev.market.faq.model.vo;

import com.dev.market.faq.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="FaqInfoVO", description = "자주하는 질문 상태 정보입니다.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaqInfoVO {

    @ApiModelProperty(
            value = "자주하는 질문 번호"
            , example = "1"
            , required = true
    )
    Long faqNo;

    @ApiModelProperty(
            value = "자주하는 질문 제목"
            , example = "결제관련 문의"
            , required = true
    )
    String faqTitle;

    @ApiModelProperty(
            value = "자주하는 질문 내용"
            , example = "결제관련 문의입니다...(중략)"
            , required = true
    )
    String faqContent;

    @ApiModelProperty(
            value = "자주하는 질문 상태"
            , example = "READY"
            , required = true
    )
    OpenYNEnum openYNEnum;

    @ApiModelProperty(
            value = "등록 날짜"
            , example = "2022-01-12 00:00:00"
            , required = true
    )
    String regDt;
}
