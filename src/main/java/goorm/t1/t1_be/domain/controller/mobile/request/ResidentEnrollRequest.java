package goorm.t1.t1_be.domain.controller.mobile.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResidentEnrollRequest {

    @NotBlank
    private Long unitNum;

    private Long buildingNum;





}
