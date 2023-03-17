package com.hotel.josunclone20230315seoyeong.service;

import com.hotel.josunclone20230315seoyeong.dto.RegisterReqDto;

public interface AccountService {
    public void duplicateEmail(RegisterReqDto registerReqDto) throws Exception;
    public void register(RegisterReqDto registerReqDto) throws Exception;
}
