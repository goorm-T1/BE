package goorm.t1.t1_be.global.exception.handler;


import goorm.t1.t1_be.global.exception.ListAccessException;
import goorm.t1.t1_be.global.exception.MessageUpdateException;
import goorm.t1.t1_be.global.exception.StoneStateUpdateException;
import goorm.t1.t1_be.global.exception.UnitNumNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.management.ListenerNotFoundException;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(ListAccessException.class)
    public ResponseEntity<ErrorMessage> listAccessException(ListAccessException e){
        return ResponseEntity.status(e.getStatus())
                .body(ErrorMsgFactory.from(e.getStatus(),e.getErrorCode(),e.getErrorMessage()));
    }

    @ExceptionHandler(MessageUpdateException.class)
    public ResponseEntity<ErrorMessage> messageUpdateException (MessageUpdateException e){
        return ResponseEntity.status(e.getStatus())
                .body(ErrorMsgFactory.from(e.getStatus(),e.getErrorCode(),e.getErrorMessage()));
    }

    @ExceptionHandler(StoneStateUpdateException.class)
    public ResponseEntity<ErrorMessage> stoneStateUpdateException (StoneStateUpdateException e){
        return ResponseEntity.status(e.getStatus())
                .body(ErrorMsgFactory.from(e.getStatus(),e.getErrorCode(),e.getErrorMessage()));
    }

    @ExceptionHandler(UnitNumNotFoundException.class)
    public ResponseEntity<ErrorMessage> unitNumNotFoundException (UnitNumNotFoundException e){
        return ResponseEntity.status(e.getStatus())
                .body(ErrorMsgFactory.from(e.getStatus(),e.getErrorCode(),e.getErrorMessage()));
    }
}
