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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stone_id")
    private Long stoneId;

    private Long stoneBg=0L;

    private Long stoneFace=0L;

    private Long stoneState=0L;


}
