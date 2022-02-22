package com.dev.market.category.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="BottomCategorySelectRequestDTO", description = "하위 카테고리 정보를 조회하는 DTO입니다.")
@Data
public class BottomCategorySelectRequestDTO{

    @ApiModelProperty(
            value = "하위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Long pdCt2No;
}
