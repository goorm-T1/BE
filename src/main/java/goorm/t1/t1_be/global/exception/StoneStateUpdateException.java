package goorm.t1.t1_be.global.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class StoneStateUpdateException extends RuntimeException{
    private final HttpStatus status = HttpStatus.CONFLICT;
    private final int errorCode = 2;
    private final String errorMessage ="돌의 상태가 변경되지 않았습니다.";
}
