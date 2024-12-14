package goorm.t1.t1_be.domain.controller.mobile.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StoneStateRequest {

    @NotBlank
    private Long unitNum;
    private Long buildingNum;
    private int stoneStatus;
    private int stoneColor;
    private int stoneFace;
    private int stoneOutline;



}