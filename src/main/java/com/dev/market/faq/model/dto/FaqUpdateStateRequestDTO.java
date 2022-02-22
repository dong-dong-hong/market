package com.dev.market.faq.model.dto;

import com.dev.market.faq.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="FaqUpdateStateRequestDTO", description = "자주하는 질문 상태를 업데이트하는 DTO입니다.")
@Data
public class FaqUpdateStateRequestDTO {

    @ApiModelProperty(
            value = "자주하는 질문 번호"
            , example = "1"
            , required = true
    )
    Long faqNo;

    @ApiModelProperty(
            value = "자주하는 질문 상태"
            , example = "OPEN"
            , required = true
    )
    OpenYNEnum openYNEnum;
}
