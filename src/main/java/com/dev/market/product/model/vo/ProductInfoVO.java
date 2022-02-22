package com.dev.market.product.model.vo;

import com.dev.market.product.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="ProductInfoVO", description = "상품 정보입니다.")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfoVO {

    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;

    @ApiModelProperty(
            value = "상품 제목"
            , example = "테스트"
            , required = true
    )
    String pdTitle;

    @ApiModelProperty(
            value = "상품 내용"
            , example = "테스트 내용"
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
            value = "상품의 상태"
            , example = "Y"
            , required = true
    )
    OpenYNEnum openYNEnum;

    @ApiModelProperty(
            value = "등록 날짜"
            , example = "2022-01-12 00:00:00"
            , required = true
    )
    String regDt;
}
