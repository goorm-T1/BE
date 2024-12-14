package goorm.t1.t1_be.domain.controller.mobile;

import goorm.t1.t1_be.domain.controller.mobile.request.StateMsgRequest;
import goorm.t1.t1_be.domain.repository.ResidentRepo;
import goorm.t1.t1_be.domain.service.StateMsgService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mobile")
public class StateMsgController {
    private final StateMsgService stateMsgService;

    @PostMapping("/setStateMsg")
    public ResponseEntity<Void> setStateMsg(@RequestBody StateMsgRequest stateMsgRequest){
        stateMsgService.setStateMsg(stateMsgRequest);
        return ResponseEntity.ok().build();
    }
}
