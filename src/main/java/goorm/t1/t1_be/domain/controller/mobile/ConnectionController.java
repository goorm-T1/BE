package goorm.t1.t1_be.domain.controller.mobile;

import goorm.t1.t1_be.domain.controller.mobile.request.ConnectionRequest;
import goorm.t1.t1_be.domain.controller.mobile.response.ConnectionResponse;
import goorm.t1.t1_be.domain.entity.MyStoneEntity;
import goorm.t1.t1_be.domain.service.ConnectionService;
import goorm.t1.t1_be.domain.service.ResidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mobile")
public class ConnectionController {

    private final ConnectionService connectionService;


    @PostMapping("/connected")
    public ResponseEntity<ConnectionResponse> connectInto(@RequestBody ConnectionRequest connectionRequest){
        ConnectionResponse connectionResponse = connectionService.getResidentInfo(connectionRequest);
        return ResponseEntity.ok(connectionResponse);
    }

}
