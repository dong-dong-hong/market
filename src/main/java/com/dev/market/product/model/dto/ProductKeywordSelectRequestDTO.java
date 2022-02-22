package com.dev.market.product.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "ProductKeywordSelectRequestDTO" , description = "상품의 키워드를 조회하는 DTO입니다.")
@Data
public class ProductKeywordSelectRequestDTO {
    @ApiModelProperty(
            value = "상품 키워드"
            , example = "테스트"
            , required = true
    )
    String pdKeyword;
}
