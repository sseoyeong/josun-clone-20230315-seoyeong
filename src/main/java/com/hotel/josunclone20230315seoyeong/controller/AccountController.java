package com.hotel.josunclone20230315seoyeong.controller;

import com.hotel.josunclone20230315seoyeong.dto.RegisterReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/account/login")
    public String login() {
        return "account/login";
    }

    @GetMapping("/account/register")
    public String register(RegisterReqDto registerReqDto) {
        return "account/register";
    }

    @GetMapping("/main/main")
    public String main() {
        return "main/main";
    }

    @GetMapping("/booking/booking")
    public String booking() {
        return "booking/booking";
    }

    @GetMapping("/booking/reserve")
    public String reserve() {
        return "booking/reserve";
    }
}
