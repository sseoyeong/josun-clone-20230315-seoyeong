package com.hotel.josunclone20230315seoyeong.config;

import com.hotel.josunclone20230315seoyeong.security.AuthFailureHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.httpBasic().disable();
        http.authorizeRequests()
                .antMatchers("/account/mypage", "/index")
                .authenticated()
                .anyRequest()
                .permitAll()
                .and()
                .formLogin()
                .usernameParameter("email")
                .loginPage("/account/login")
                .loginProcessingUrl("/account/login")
                .failureHandler(new AuthFailureHandler())
                .defaultSuccessUrl("/index");
    }
}
