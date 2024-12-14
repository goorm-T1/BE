package goorm.t1.t1_be.domain.repository;

import goorm.t1.t1_be.domain.entity.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResidentRepo extends JpaRepository<ResidentEntity, Long> {
    ResidentEntity findByUnitNumAndBuildingNum(@Param("resident_id") Long unitNum, Long buildingNum);

    ResidentEntity findByUnitNum(@Param("resident_id") Long unitNum);


}
