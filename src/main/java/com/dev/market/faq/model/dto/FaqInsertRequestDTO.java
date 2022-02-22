package com.dev.market.faq.model.dto;


import com.dev.market.faq.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="FaqInsertRequestDTO", description = "자주하는 질문 정보를 삽입하는 DTO입니다.")
@Data
public class FaqInsertRequestDTO {

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
            value = "자주하는 질문의 상태"
            , example = "READY"
            , required = true
    )
    OpenYNEnum openYNEnum;
}
