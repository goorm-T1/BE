package goorm.t1.t1_be.domain.service;

import goorm.t1.t1_be.domain.controller.mobile.request.ResidentEnrollRequest;
import goorm.t1.t1_be.domain.entity.MyStoneEntity;
import goorm.t1.t1_be.domain.entity.ResidentEntity;
import goorm.t1.t1_be.domain.repository.ResidentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class ResidentService {

    private final ResidentRepo residentRepo;

    @Transactional
    public Long enrollResident(ResidentEnrollRequest residentEnrollRequest){
        ResidentEntity residentEntity = ResidentEntity.builder()
                .unitNum(residentEnrollRequest.getUnitNum())
                .stateMsg("")
                .myStoneEntity(new MyStoneEntity())
                .build();
        return residentRepo.save(residentEntity).getUnitNum();
    }

//    @Transactional
//    public Long fixStateMsg(request){
//        ResidentEntity residentEntity = residentRepo.findByUnitNum(request.getUnitNum);
//
//        residentRepo.updateStateMsgByUnitNum(residentEntity.getUnitNum(), request.newStateMsg);
//        return residentEntity.getUnitNum();
//    }
}
