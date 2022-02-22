package com.dev.market.product.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="ProductViewInsertRequestDTO", description = "상품 조회수를 삽입하는 DTO입니다.")
@NoArgsConstructor
@Data
public class ProductViewInsertRequestDTO {

    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;
}
