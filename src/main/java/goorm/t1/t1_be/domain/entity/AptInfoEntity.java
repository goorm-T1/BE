package goorm.t1.t1_be.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AptInfoEntity {
    @Id
    @Column(name="building_number")
    private  Long buildingNumber;

    private String aptName;
}
