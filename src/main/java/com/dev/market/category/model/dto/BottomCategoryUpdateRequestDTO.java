package com.dev.market.category.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="BottomCategoryUpdateRequestDTO", description = "하위 카테고리 정보를 업데이트하는 DTO입니다.")
@Data
public class BottomCategoryUpdateRequestDTO{

    @ApiModelProperty(
            value = "하위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Long pdCt2No;

    @ApiModelProperty(
            value = "하위 카테고리 이름"
            , example = "패션/잡화"
            , required = true
    )
    String ctName;
}
