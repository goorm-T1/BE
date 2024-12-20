package goorm.t1.t1_be.domain.service;

import goorm.t1.t1_be.domain.controller.mobile.request.StoneStateRequest;
import goorm.t1.t1_be.domain.entity.MyStoneEntity;
import goorm.t1.t1_be.domain.repository.MyStoneRepo;
import goorm.t1.t1_be.domain.repository.ResidentRepo;
import goorm.t1.t1_be.global.exception.StoneStateUpdateException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class SetStoneStateService {
    private final MyStoneRepo myStoneRepo;
    private final ResidentRepo residentRepo;

    public void setStoneState(StoneStateRequest stoneStateRequest){

        try{
            Long stoneId = residentRepo.findByUnitNumAndBuildingNum(stoneStateRequest.getUnitNum(),stoneStateRequest.getBuildingNum()).getMyStoneEntity().getStoneId();
            MyStoneEntity myStoneEntity = myStoneRepo.findByStoneId(stoneId);
            myStoneEntity.setStoneState(stoneStateRequest.getStoneStatus());
            myStoneRepo.save(myStoneEntity);
        }catch (Exception e){
            throw new StoneStateUpdateException("돌의 상태가 변경되지 않았습니다");
        }

    }
}
