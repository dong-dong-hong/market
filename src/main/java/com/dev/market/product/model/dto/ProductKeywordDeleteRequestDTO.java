package com.dev.market.product.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "ProductKeywordDeleteRequestDTO" , description = "상품의 키워드를 삭제하는 DTO입니다." )
@Data
public class ProductKeywordDeleteRequestDTO {
    @ApiModelProperty(
            value = "상품 키워드 번호"
            , example = "1"
            , required = true
    )
    Integer pdKeywordNo;
}
