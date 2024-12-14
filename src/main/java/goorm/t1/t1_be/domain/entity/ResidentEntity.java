package goorm.t1.t1_be.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResidentEntity {
    @Id
    @Column(name="resident_id")
    private Long unitNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_number")
    private  AptInfoEntity aptInfoEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stone_id")
    private  MyStoneEntity myStoneEntity;

}
