package com.dev.market.category.model.vo;

import com.dev.market.category.util.enums.UseYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="BottomCategoryInfoVO", description = "하위 카테고리 정보입니다.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BottomCategoryInfoVO{

    @ApiModelProperty(
            value = "하위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Long pdCt2No;

    @ApiModelProperty(
            value = "하위 카테고리 이름"
            , example = "티셔츠"
            , required = true
    )
    String ctName;

    @ApiModelProperty(
            value = "하위 카테고리의 상태"
            , example = "Y"
            , required = true
    )
    UseYNEnum useYNEnum;

    @ApiModelProperty(
            value = "등록 날짜"
            , example = "2022-01-12 00:00:00"
            , required = true
    )
    String regDt;
}
