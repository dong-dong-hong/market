package com.dev.market.server.model.vo;

import com.dev.market.server.util.enums.ServerStateEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="ServerStateInfoVO", description = "서버 상태 정보입니다.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerStateInfoVO {

    @ApiModelProperty(
            value = "서버 상태 관련 제목"
            , example = "서버 점검 중"
            , required = true
    )
    String serverStateTitle;

    @ApiModelProperty(
            value = "서버 상태 관련 내용"
            , example = "홈페이지 리뉴얼 작업으로 인한 서버 점검 중입니다."
            , required = true
    )
    String serverStateContent;

    @ApiModelProperty(
            value = "서버 상태"
            , example = "UPDATE"
            , required = true
    )
    ServerStateEnum serverStateEnum;

    @ApiModelProperty(
            value = "등록 날짜"
            , example = "2022-01-12 00:00:00"
            , required = true
    )
    String regDt;
}
