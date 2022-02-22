package com.dev.market.category.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="TopCategoryUpdateRequestDTO", description = "상위 카테고리 정보를 업데이트하는 DTO입니다.")
@Data
public class TopCategoryUpdateRequestDTO{

    @ApiModelProperty(
            value = "상위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Long pdCt1No;

    @ApiModelProperty(
            value = "상위 카테고리 이름"
            , example = "패션/잡화"
            , required = true
    )
    String ctName;
}
