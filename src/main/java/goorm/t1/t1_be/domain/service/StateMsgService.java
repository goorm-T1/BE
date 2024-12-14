package goorm.t1.t1_be.domain.service;

import goorm.t1.t1_be.domain.controller.mobile.request.StateMsgRequest;
import goorm.t1.t1_be.domain.entity.ResidentEntity;
import goorm.t1.t1_be.domain.repository.ResidentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class StateMsgService {
    private final ResidentRepo residentRepo;

    public void setStateMsg(StateMsgRequest stateMsgRequest){
        ResidentEntity residentEntity = residentRepo.findByUnitNumAndBuildingNum(stateMsgRequest.getUnitNum(), stateMsgRequest.getBuildingNum());
        residentEntity.setStateMsg(stateMsgRequest.getStateMsg());

        residentRepo.save(residentEntity);


    }
}
