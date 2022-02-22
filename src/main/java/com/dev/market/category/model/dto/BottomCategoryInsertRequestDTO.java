package com.dev.market.category.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="BottomCategoryInsertRequestDTO", description = "하위 카테고리 이름을 삽입하는 DTO입니다.")
@Data
public class BottomCategoryInsertRequestDTO {

    @ApiModelProperty(
            value = "상위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Long pdCt1No;

    @ApiModelProperty(
            value = "하위 카테고리 이름"
            , example = "티셔츠"
            , required = true
    )
    String ctName;
}
