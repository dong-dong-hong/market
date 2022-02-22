package com.dev.market.product.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "ProductKeywordInfoList" , description = "상품 키워드 정보입니다.")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductKeywordInfoVO {
    @ApiModelProperty(
            value = "상품 키워드"
            ,example = "테스트"
            , required = true
    )
    String pdKeyword;
    @ApiModelProperty(
            value = "상품 번호"
            , example = "1"
            , required = true
    )
    Integer pdNo;
    @ApiModelProperty(
            value = "등록 날짜"
            , example = "2022-01-12 00:00:00"
            , required = true
    )
    String regDt;
}
