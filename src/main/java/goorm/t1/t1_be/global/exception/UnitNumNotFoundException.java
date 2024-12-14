package goorm.t1.t1_be.global.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class UnitNumNotFoundException extends RuntimeException{
    private final HttpStatus status = HttpStatus.NOT_FOUND;
    private final int errorCode = 1;
    private final String errorMessage ="존재하지 않는 가구 입니다.";
}
