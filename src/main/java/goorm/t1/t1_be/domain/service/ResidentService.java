package goorm.t1.t1_be.domain.service;

import goorm.t1.t1_be.domain.controller.mobile.request.ResidentEnrollRequest;
import goorm.t1.t1_be.domain.entity.MyStoneEntity;
import goorm.t1.t1_be.domain.entity.ResidentEntity;
import goorm.t1.t1_be.domain.repository.MyStoneRepo;
import goorm.t1.t1_be.domain.repository.ResidentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class ResidentService {

    private final ResidentRepo residentRepo;
    private final MyStoneRepo myStoneRepo;


    @Transactional
    public ResidentEntity enrollResident(ResidentEnrollRequest residentEnrollRequest){
        // 기본값의 MyStone 생성 및 저장
        MyStoneEntity myStoneEntity = new MyStoneEntity();
        myStoneRepo.save(myStoneEntity);

        ResidentEntity residentEntity = ResidentEntity.builder()
                .unitNum(residentEnrollRequest.getUnitNum())
                .buildingNum(residentEnrollRequest.getBuildingNum())
                .stateMsg("")
                .myStoneEntity(myStoneEntity)
                .build();
        return residentRepo.save(residentEntity);
    }

//    @Transactional
//    public Long fixStateMsg(request){
//        ResidentEntity residentEntity = residentRepo.findByUnitNum(request.getUnitNum);
//
//        residentRepo.updateStateMsgByUnitNum(residentEntity.getUnitNum(), request.newStateMsg);
//        return residentEntity.getUnitNum();
//    }
}
