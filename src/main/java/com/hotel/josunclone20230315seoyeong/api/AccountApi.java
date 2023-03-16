package com.hotel.josunclone20230315seoyeong.api;

import com.hotel.josunclone20230315seoyeong.aop.annotation.LogAspect;
import com.hotel.josunclone20230315seoyeong.dto.CMRespDto;
import com.hotel.josunclone20230315seoyeong.dto.RegisterReqDto;
import com.hotel.josunclone20230315seoyeong.dto.ReserveReqDto;
import com.hotel.josunclone20230315seoyeong.dto.validation.ValidationSequence;
import com.hotel.josunclone20230315seoyeong.exception.CustomValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping({"/api/account", "/api/booking"})
@RestController
public class AccountApi {

    @LogAspect
    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated(ValidationSequence.class) @RequestBody RegisterReqDto registerReqDto, BindingResult bindingResult) throws Exception{

        return ResponseEntity.created(null).body(new CMRespDto<>("회원가입 성공", registerReqDto));
    }

    @LogAspect
    @PostMapping("/reserve")
    public ResponseEntity<?> reserve(@Validated(ValidationSequence.class) @RequestBody ReserveReqDto reserveReqDto, BindingResult bindingResult) throws Exception{

        return ResponseEntity.created(null).body(new CMRespDto<>("예약 성공", reserveReqDto));
    }
}
