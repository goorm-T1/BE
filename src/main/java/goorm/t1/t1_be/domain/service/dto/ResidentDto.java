package goorm.t1.t1_be.domain.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResidentDto {
    private Long unitNum;
    private Long buildingNum;
    private String stateMsg;
}
