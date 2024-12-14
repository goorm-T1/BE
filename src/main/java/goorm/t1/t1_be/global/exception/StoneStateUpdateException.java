package goorm.t1.t1_be.global.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class StoneStateUpdateException extends RuntimeException{
    private final HttpStatus status = HttpStatus.CONFLICT;
    private final int errorCode = 2;
    private final String errorMessage;
}
