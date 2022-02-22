package com.dev.market.product.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "ProductViewInfoVO" , description = "상품 조회수 정보입니다.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductViewInfoVO {
    @ApiModelProperty(
            value = "상품 조회수 번호"
            , example = "1"
            , required = true
    )
    Long viewNo;
    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;
    @ApiModelProperty(
            value = "상품 조회수"
            , example = "12"
            , required = true
    )
    Integer pdViewCnt;
    @ApiModelProperty(
            value = "등록 날짜"
            , example = "2022-01-12 00:00:00"
            , required = true
    )
    String regDt;
}
