package com.dev.market.category.model.dto;

import com.dev.market.category.util.enums.UseYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="TopCategoryUpdateStateRequestDTO", description = "상위 카테고리 상태를 업데이트하는 DTO입니다.")
@Data
public class TopCategoryUpdateStateRequestDTO {

    @ApiModelProperty(
            value = "상위 카테고리 번호"
            , example = "1"
            , required = true
    )
    Long pdCt1No;

    @ApiModelProperty(
            value = "상위 카테고리의 상태"
            , example = "Y"
            , required = true
    )
    UseYNEnum useYNEnum;
}
