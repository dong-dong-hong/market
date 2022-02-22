package com.dev.market.faq.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="FaqSelectRequestDTO", description = "자주하는 질문을 조회하는 DTO입니다.")
@Data
public class FaqSelectRequestDTO {

    @ApiModelProperty(
            value = "자주하는 질문 번호"
            , example = "1"
            , required = true
    )
    Long faqNo;
}
