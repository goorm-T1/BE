package goorm.t1.t1_be.domain.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyStoneEntity {
    @Id
    @Column(name="stone_id")
    private Long stoneId;

    private Long stoneBg;

    private Long stoneFace;

    private Long stoneState;
}
