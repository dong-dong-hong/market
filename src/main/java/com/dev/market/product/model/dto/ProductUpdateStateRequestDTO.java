package com.dev.market.product.model.dto;

import com.dev.market.product.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="ProductUpdateStateRequestDTO", description = "상품의 상태를 업데이트하는 DTO입니다.")
@Data
public class ProductUpdateStateRequestDTO {

    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;

    @ApiModelProperty(
            value = "자주하는 질문 상태"
            , example = "Y"
            , required = true
    )
    OpenYNEnum openYNEnum;
}
