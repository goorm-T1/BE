package goorm.t1.t1_be.domain.controller.tab;

import goorm.t1.t1_be.domain.service.GetStateListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tab")
public class StateListController {

    private final GetStateListService getStateListService;

    @GetMapping("/getStateList")
    public ResponseEntity<List<StateListResponse>> getStateList(){
        List<StateListResponse> returnList = getStateListService.getStateList();
        return ResponseEntity.ok(returnList);

    }
}
