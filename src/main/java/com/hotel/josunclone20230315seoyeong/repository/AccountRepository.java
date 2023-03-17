package com.hotel.josunclone20230315seoyeong.repository;

import com.hotel.josunclone20230315seoyeong.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {
    public User findUserByEmail(String email) throws Exception;
    public int saveUser(User user) throws Exception;
}
