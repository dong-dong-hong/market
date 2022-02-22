package com.dev.market.faq.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel(value="FaqUpdateRequestDTO", description = "자주하는 질문 정보를 업데이트하는 DTO입니다.")
@Data
public class FaqUpdateRequestDTO {

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
            value = "공지사항 내용"
            , example = "결제관련 문의입니다...(중략)"
            , required = true
    )
    String faqContent;
}
