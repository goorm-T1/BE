package goorm.t1.t1_be.domain.repository;

import goorm.t1.t1_be.domain.entity.MyStoneEntity;
import goorm.t1.t1_be.domain.entity.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyStoneRepo extends JpaRepository<MyStoneEntity, Long> {
    Optional<MyStoneEntity> findByStoneId(@Param("stone_id") Long stoneId);
}
