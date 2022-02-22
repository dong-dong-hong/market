package com.dev.market.server.service;

import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVO;

import java.util.List;

public interface ServerService {
    List<ServerStateInfoVO> selectServerStateInfoList();
    ServerStateInfoVO selectServerStateInfo(ServerStateSelectRequestDTO serverStateSelectRequestDTO);
    Boolean insertServerStateInfo(ServerStateInsertRequestDTO serverStateInsertRequestDTO);
    Boolean updateServerStateInfo(ServerStateUpdateRequestDTO serverStateUpdateRequestDTO);
}
