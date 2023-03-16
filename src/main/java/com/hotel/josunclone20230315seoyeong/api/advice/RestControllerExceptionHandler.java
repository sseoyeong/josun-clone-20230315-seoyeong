package com.hotel.josunclone20230315seoyeong.api.advice;

import com.hotel.josunclone20230315seoyeong.dto.CMRespDto;
import com.hotel.josunclone20230315seoyeong.exception.CustomValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.beanvalidation.CustomValidatorBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class RestControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<?> validationErrorException(CustomValidationException e) {
        return ResponseEntity.badRequest().body(new CMRespDto<>(e.getMessage(), e.getErrorMap()));
    }
}
