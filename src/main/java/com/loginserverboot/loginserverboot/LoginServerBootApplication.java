package com.loginserverboot.loginserverboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // Timestamped 에서 실시간으로 반환한 테이블에 대하여 반응할 수 있게 어디팅 활성화
// 어디팅 = 감시
@SpringBootApplication
public class LoginServerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginServerBootApplication.class, args);
    }

}
