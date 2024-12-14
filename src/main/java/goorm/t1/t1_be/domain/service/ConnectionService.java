package goorm.t1.t1_be.domain.service;


import goorm.t1.t1_be.domain.controller.mobile.request.ConnectionRequest;
import goorm.t1.t1_be.domain.controller.mobile.response.ConnectionResponse;
import goorm.t1.t1_be.domain.entity.MyStoneEntity;
import goorm.t1.t1_be.domain.entity.ResidentEntity;
import goorm.t1.t1_be.domain.repository.MyStoneRepo;
import goorm.t1.t1_be.domain.repository.ResidentRepo;
import goorm.t1.t1_be.domain.service.dto.ResidentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class ConnectionService {

    private final ResidentRepo residentRepo;
    private final MyStoneRepo myStoneRepo;


    public ConnectionResponse getResidentInfo(ConnectionRequest connectionRequest){

        //residentDto | connectionDto
        ResidentEntity residentEntity = residentRepo.findByUnitNumAndBuildingNum(connectionRequest.getUnitNum(), connectionRequest.getBuildingNum());

        MyStoneEntity myStoneEntity = myStoneRepo.findByStoneId(residentEntity.getMyStoneEntity().getStoneId());

        return ConnectionResponse.builder()
                .unitNum(residentEntity.getUnitNum())
                .stateMsg(residentEntity.getStateMsg())
                .stoneState(myStoneEntity.getStoneState())
                .stoneColor(myStoneEntity.getStoneColor())
                .stoneFace(myStoneEntity.getStoneFace())
                .stoneOutline(myStoneEntity.getStoneOutline())
                .build();


    }
}
