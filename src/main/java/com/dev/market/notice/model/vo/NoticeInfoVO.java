package com.dev.market.notice.model.vo;

import com.dev.market.notice.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="NoticeInfoVO", description = "서버 상태 정보입니다.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeInfoVO {

    @ApiModelProperty(
            value = "공지사항 번호"
            , example = "1"
            , required = true
    )
    Long noticeNo;

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
            value = "공지사항 상태"
            , example = "READY"
            , required = true
    )
    OpenYNEnum openYNEnum;

    @ApiModelProperty(
            value = "등록 날짜"
            , example = "2022-01-12 00:00:00"
            , required = true
    )
    String regDt;
}
