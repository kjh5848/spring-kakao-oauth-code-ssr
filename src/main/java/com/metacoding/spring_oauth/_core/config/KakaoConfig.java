package com.metacoding.spring_oauth._core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.metacoding.spring_oauth._core.utils.KakaoToken;

@Configuration
public class KakaoConfig {

    @Bean
    public KakaoToken kakaoToken() {
        return new KakaoToken();
    }
}
