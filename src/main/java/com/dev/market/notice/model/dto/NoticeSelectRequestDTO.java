package com.dev.market.notice.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="NoticeSelectRequestDTO", description = "공지사항 정보를 조회하는 DTO입니다.")
@Data
public class NoticeSelectRequestDTO {

    @ApiModelProperty(
            value = "공지사항 번호"
            , example = "1"
            , required = true
    )
    Long noticeNo;
}
