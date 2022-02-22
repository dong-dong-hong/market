package com.dev.market.product.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "ProductKeywordInsertRequestDTO" , description = "상품의 키워드를 삽입하는 DTO입니다.")
@Data
public class ProductKeywordInsertRequestDTO {
    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;
    @ApiModelProperty(
            value = "상품 키워드"
            , example = "테스트"
            , required = true
    )
    String pdKeyword;
}
