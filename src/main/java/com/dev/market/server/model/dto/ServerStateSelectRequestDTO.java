package com.dev.market.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="ServerStateSelectRequestDTO", description = "서버 상태 정보를 조회하는 DTO입니다.")
@Data
public class ServerStateSelectRequestDTO {

    @ApiModelProperty(
            value = "서버 상태 번호"
            , example = "1"
            , required = true
    )
    Long serverStateNo;
}
