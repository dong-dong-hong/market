package com.dev.market.notice.model.dto;

import com.dev.market.notice.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="NoticeInsertRequestDTO", description = "공지사항 정보를 삽입하는 DTO입니다.")
@Data
public class NoticeInsertRequestDTO {

    @ApiModelProperty(
            value = "공지사항 제목"
            , example = "마켓 OPEN BETA 서비스 공지"
            , required = true
    )
    String noticeTitle;

    @ApiModelProperty(
            value = "공지사항 내용"
            , example = "마켓 OPEN BETA 서비스 이용 안내 공지사항 입니다."
            , required = true
    )
    String noticeContent;

    @ApiModelProperty(
            value = "공지사항의 상태"
            , example = "READY"
            , required = true
    )
    OpenYNEnum openYNEnum;
}
