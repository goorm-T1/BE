package goorm.t1.t1_be.global.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class MessageUpdateException extends RuntimeException {
    private final HttpStatus status = HttpStatus.CONFLICT;
    private final int errorCode = 3;
    private final String errorMessage ="상태메세지 변경에 실패했습니다.";
}
