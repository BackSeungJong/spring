package com.loginserverboot.loginserverboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor // JPA 를 위한 기본 생성자
@Getter
public class UserRequestDto {
    private String id;
    private String pw, name, gender, PN, email, address;

    // 필요한 생성자 오버로딩
    public UserRequestDto(String id,String pw, String name, String gender, String PN, String email, String address){
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.gender=gender;
        this.PN=PN;
        this.email=email;
        this.address=address;
    }
    /*public UserRequestDto(String id, String pw, String name, String gender, String PN, String email, String address, Timestamp regDate){
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.gender=gender;
        this.PN=PN;
        this.email=email;
        this.address=address;
    }*/

}
