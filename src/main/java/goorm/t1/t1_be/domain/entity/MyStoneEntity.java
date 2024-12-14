package goorm.t1.t1_be.domain.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Random;

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

    private int stoneDirection=new Random().nextInt(2); //방향
    private int stoneState=0;
    private int stoneColor=new Random().nextInt(4);
    private int stoneOutline=new Random().nextInt(4);


}
