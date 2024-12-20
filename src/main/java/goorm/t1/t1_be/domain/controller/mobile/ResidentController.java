package goorm.t1.t1_be.domain.controller.mobile;


import goorm.t1.t1_be.domain.controller.mobile.request.ResidentEnrollRequest;
import goorm.t1.t1_be.domain.entity.ResidentEntity;
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
public class ResidentController {

    private final ResidentService residentService;

    @PostMapping("/enroll")
    public ResponseEntity<ResidentEntity> enroll(@RequestBody ResidentEnrollRequest residentEnrollRequest){
        ResidentEntity resident = residentService.enrollResident(residentEnrollRequest);
        return  ResponseEntity.ok(resident);
    }
}
