package com.loginserverboot.loginserverboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // JPA 를 위한 기본 생성자
@Getter
public class UserRequestDto {
    private int code;
    private String id, pw, firstname;

    // 필요한 생성자 오버로딩
    public UserRequestDto(String id, String pw){
        this.id=id;
        this.pw=pw;
    }
    public UserRequestDto(String id, String pw, String firstname){
        this.id=id;
        this.pw=pw;
        this.firstname=firstname;
    }
}
