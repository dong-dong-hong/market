package com.dev.market.product.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="ProductUpdateRequestDTO", description = "상품을 업데이트하는 DTO입니다.")
@Data
public class ProductUpdateRequestDTO {

    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;

    @ApiModelProperty(
            value = "상품 제목"
            , example = "상품 테스트 제목"
            , required = true
    )
    String pdTitle;

    @ApiModelProperty(
            value = "상품 내용"
            , example = "상품 테스트 내용"
            , required = true
    )
    String pdContent;

    @ApiModelProperty(
            value = "상품 가격"
            , example = "10000"
            , required = true
    )
    Integer pdPrice;

    @ApiModelProperty(
            value = "상품 상위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Integer pdCt1No;

    @ApiModelProperty(
            value = "상품 하위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Integer pdCt2No;
}
