package goorm.t1.t1_be.domain.controller.mobile.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConnectionResponse {
    private long buildingNum;
    private long unitNum;
    private String stateMsg;
    private int stoneState;
    private int stoneColor;
    private int stoneFace;
    private int stoneOutline;

}
