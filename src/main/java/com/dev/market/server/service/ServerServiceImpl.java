package com.dev.market.server.service;

import com.dev.market.server.model.dao.ServerDAO;
import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerDAO serverDAO;

    @Override
    public List<ServerStateInfoVO> selectServerStateInfoList() {
        return serverDAO.selectServerStateInfoList();
    }

    @Override
    public ServerStateInfoVO selectServerStateInfo(ServerStateSelectRequestDTO serverStateSelectRequestDTO) {
        return serverDAO.selectServerStateInfo(serverStateSelectRequestDTO);
    }

    @Override
    public Boolean insertServerStateInfo(ServerStateInsertRequestDTO serverStateInsertRequestDTO) {

        Boolean successOrNot = serverDAO.insertServerStateInfo(serverStateInsertRequestDTO) == 1;

        return successOrNot;
    }

    @Override
    public Boolean updateServerStateInfo(ServerStateUpdateRequestDTO serverStateUpdateRequestDTO) {

        Boolean successOrNot = serverDAO.updateServerStateInfo(serverStateUpdateRequestDTO) == 1;

        return successOrNot;
    }
}

