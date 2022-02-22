package com.dev.market.category.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="TopCategoryInsertRequestDTO", description = "상위 카테고리 이름을 삽입하는 DTO입니다.")
@Data
public class TopCategoryInsertRequestDTO {

    @ApiModelProperty(
            value = "상위 카테고리 이름"
            , example = "패션/잡화"
            , required = true
    )
    String pdCt1Name;
}
