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

    private int stoneFace=0;

    private int stoneState=0;

    private int stoneColor=0;

    private int stoneOutline=0;


}
