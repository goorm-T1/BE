package goorm.t1.t1_be.domain.controller.mobile;


import goorm.t1.t1_be.domain.controller.mobile.request.ResidentEnrollRequest;
import goorm.t1.t1_be.domain.service.ResidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mobile")
public class ResidentController {

    private final ResidentService residentService;


    @PostMapping("/enroll")
    public ResponseEntity<Void> enroll(@RequestBody ResidentEnrollRequest residentEnrollRequest){
        Long unitNum = residentService.enrollResident(residentEnrollRequest);
        return  ResponseEntity.ok().build();
    }
}
