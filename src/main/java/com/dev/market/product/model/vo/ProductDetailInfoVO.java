package com.dev.market.product.model.vo;

import com.dev.market.product.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="ProductDetailInfoVO", description = "상품 상세 정보입니다.")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailInfoVO {

    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Long pdNo;

    @ApiModelProperty(
            value = "상품 제목"
            , example = "상품_제목_테스트"
            , required = true
    )
    String pdTitle;

    @ApiModelProperty(
            value = "상품 내용"
            , example = "상품_내용_테스트"
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
            value = "상품 상위 카테고리 이름"
            , example = "의류/잡화"
            , required = true
    )
    String pdCt1Name;

    @ApiModelProperty(
            value = "상품 하위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Integer pdCt2No;

    @ApiModelProperty(
            value = "상품 하위 카테고리 이름"
            , example = "티셔츠"
            , required = true
    )
    String pdCt2Name;

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
