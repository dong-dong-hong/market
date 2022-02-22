package com.dev.market.product.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="ProductDeleteRequestDTO", description = "상품을 삭제하는 DTO입니다.")
@Data
public class ProductDeleteRequestDTO {

    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;
}
