package goorm.t1.t1_be.domain.service;


import goorm.t1.t1_be.domain.controller.tab.StateListResponse;
import goorm.t1.t1_be.domain.entity.ResidentEntity;
import goorm.t1.t1_be.domain.repository.ResidentRepo;
import goorm.t1.t1_be.global.exception.ListAccessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class GetStateListService {
    private final ResidentRepo residentRepo;

    public List<StateListResponse> getStateList(){
        List<StateListResponse> stateList = new ArrayList<>();
        List<ResidentEntity> residentList = residentRepo.findAll();

        try {
            for(ResidentEntity resident : residentList){
                StateListResponse stateListResponse = StateListResponse.builder()
                        .unitNum(resident.getUnitNum())
                        .stateMsg(resident.getStateMsg())
                        .stoneColor(resident.getMyStoneEntity().getStoneColor())
                        .stoneDirection(resident.getMyStoneEntity().getStoneDirection())
                        .stoneOutline(resident.getMyStoneEntity().getStoneOutline())
                        .stoneState(resident.getMyStoneEntity().getStoneState())
                        .build();
                stateList.add(stateListResponse);
            }
        }catch (Exception e){
            throw new ListAccessException("전체 사용자 정보를 불러오지 못했습니다.");
        }

        return stateList;

    }
}
