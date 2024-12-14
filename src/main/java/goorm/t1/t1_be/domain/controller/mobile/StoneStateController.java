package goorm.t1.t1_be.domain.controller.mobile;

import goorm.t1.t1_be.domain.controller.mobile.request.ConnectionRequest;
import goorm.t1.t1_be.domain.controller.mobile.request.StoneStateRequest;
import goorm.t1.t1_be.domain.controller.mobile.response.ConnectionResponse;
import goorm.t1.t1_be.domain.service.SetStoneStateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mobile")
public class StoneStateController {

    private final SetStoneStateService setStoneStateService;
    @PostMapping("/setStoneState")
    public ResponseEntity<Void> setStoneState(@RequestBody StoneStateRequest stoneStateRequest){
        //1. request에 있는 unitNum으로 돌멩이 불러오기.
        //2. 돌멩이 정보 변경.
        setStoneStateService.setStoneState(stoneStateRequest);
        return ResponseEntity.ok().build();
    }

}
