package goorm.t1.t1_be.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class ListAccessException extends RuntimeException{
    private final HttpStatus status = HttpStatus.CONFLICT;
    private final int errorCode = 4;
    private final String errorMessage ="모든 사용자 정보를 불러오지 못했습니다.";
}
