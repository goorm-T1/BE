package goorm.t1.t1_be.domain.controller.mobile.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResidentResponse {
    private long buildingNum;
    private long unitNum;
    private String msg;
    private Long stoneState;
    private Long stoneColor;
    private Long stoneFace;
    private Long stoneOutline;

}
