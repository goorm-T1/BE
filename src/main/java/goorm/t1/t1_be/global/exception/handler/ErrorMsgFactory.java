package goorm.t1.t1_be.global.exception.handler;

import org.springframework.http.HttpStatus;

public class ErrorMsgFactory {
    public static ErrorMessage from(HttpStatus status, int errorCode, String errorMessage){
        return ErrorMessage.builder()
                .status(status.value())
                .errorCode(errorCode)
                .message(errorMessage)
                .build();
    }
}
