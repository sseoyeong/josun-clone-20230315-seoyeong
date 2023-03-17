package com.hotel.josunclone20230315seoyeong.controller;

import com.hotel.josunclone20230315seoyeong.dto.RegisterReqDto;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    @GetMapping("/account/login")
    public String login(Model model, @RequestParam @Nullable String email, @RequestParam @Nullable String error) {
        model.addAttribute("email", email == null ? "" : email);
        model.addAttribute("error", email == null ? "" : error);
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
