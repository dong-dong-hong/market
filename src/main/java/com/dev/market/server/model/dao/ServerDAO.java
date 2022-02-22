package com.dev.market.server.model.dao;

import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServerDAO {
    List<ServerStateInfoVO> selectServerStateInfoList();
    ServerStateInfoVO selectServerStateInfo(ServerStateSelectRequestDTO serverStateSelectRequestDTO);
    Integer insertServerStateInfo(ServerStateInsertRequestDTO serverStateInsertRequestDTO);
    Integer updateServerStateInfo(ServerStateUpdateRequestDTO serverStateUpdateRequestDTO);

}
