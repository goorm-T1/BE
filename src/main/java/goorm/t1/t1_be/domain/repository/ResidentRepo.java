package goorm.t1.t1_be.domain.repository;

import goorm.t1.t1_be.domain.entity.ResidentEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResidentRepo extends JpaRepository<ResidentEntity, Long> {
    ResidentEntity findByUnitNumAndBuildingNum(@Param("resident_id") Long unitNum, Long buildingNum);

    ResidentEntity findByUnitNum(@Param("resident_id") Long unitNum);


    //보류

    @Modifying
    @Transactional
    @Query("UPDATE ResidentEntity r SET r.stateMsg = :stateMsg WHERE r.unitNum = :unitNum")
    void updateStateMsgByUnitNum(@Param("unitNum") Long unitNum, @Param("stateMsg") String stateMsg);

}
