package goorm.t1.t1_be.domain.controller.tab;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StateListResponse {
    private Long unitNum;
    private String stateMsg;
    private int stoneColor;
    private int stoneFace;
    private int stoneOutline;
}
