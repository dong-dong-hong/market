package com.dev.market.server.controller;

import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVO;
import com.dev.market.server.service.ServerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"Server API"})
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @ApiOperation(value = "최초 테스트", notes = "Hello World를 출력하는 API입니다")
    @GetMapping("/test")
    public String test() {
        return "helloWorld";
    }

    @ApiOperation(value = "서버 상태 리스트 조회", notes = "서버 상태에 대한 정보 리스트를 조회하는 API입니다.")
    @GetMapping("/info/list")
    public List<ServerStateInfoVO> selectServerStateInfoList() {
        return serverService.selectServerStateInfoList();
    }

    @ApiOperation(value = "서버 상태 조회", notes = "서버 상태에 대한 정보를 조회하는 API입니다.")
    @GetMapping("/info")
    public ServerStateInfoVO selectServerStateInfo(
            @ApiParam(name = "serverStateNo", value = "서버 상태 번호", required = true, example = "1")
            @RequestParam("serverStateNo") Long serverStateNo
    ) {

        ServerStateSelectRequestDTO serverStateSelectRequestDTO = new ServerStateSelectRequestDTO();
        serverStateSelectRequestDTO.setServerStateNo(serverStateNo);

        return serverService.selectServerStateInfo(serverStateSelectRequestDTO);
    }

    @ApiOperation(value = "서버 상태 삽입", notes = "서버 상태에 대한 정보를 삽입하는 API입니다.")
    @PostMapping("/info")
    public Boolean insertServerStateInfo(
            @ApiParam(name = "serverStateInsertRequestDTO", value = "서버 상태 삽입 객체 정보", required = true)
            @RequestBody ServerStateInsertRequestDTO serverStateInsertRequestDTO
    ) {
        return serverService.insertServerStateInfo(serverStateInsertRequestDTO);
    }

    @ApiOperation(value = "서버 상태 업데이트", notes = "서버 상태에 대한 정보를 업데이트하는 API입니다.")
    @PutMapping("/info")
    public Boolean updateServerStateInfo(
            @ApiParam(name = "serverStateUpdateRequestDTO", value = "서버 상태 업데이트 객체 정보", required = true)
            @RequestBody ServerStateUpdateRequestDTO serverStateUpdateRequestDTO
    ) {
        return serverService.updateServerStateInfo(serverStateUpdateRequestDTO);
    }
}
