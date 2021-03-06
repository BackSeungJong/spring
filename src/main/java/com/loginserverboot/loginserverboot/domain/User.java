package com.loginserverboot.loginserverboot.domain;

import com.loginserverboot.loginserverboot.util.Timestamped;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

// Domain : table

@NoArgsConstructor // (jpa가 사용하는 기본생성자) 기본생성자를 자동으로 만들어줌
@Getter
@Table(name = "users") // 엔터티가 맵핑될 테이블 이름을 특정함
@Entity // 이 클래스가 연동된 데이터베이스의 테이블에 해당함을 알려줌 (테이블 맵핑 대상으로 지정)
public class User extends Timestamped {
    @Id // PK를 알려줌
    private String id;

    @NotNull
    @Column
    private String pw, name, gender, PN, email, address;

    // UserRequestDto를 활용한 생성자 만들기
    // (개발자가 사용하는 기본생성자)
    public User(UserRequestDto dto){
        this.id = dto.getId();
        this.pw = dto.getPw();
        this.name = dto.getName();
        this.gender = dto.getGender();
        this.PN = dto.getPN();
        this.email = dto.getEmail();
        this.address = dto.getAddress();
    }
//  public User(){}

//    public User(String id, String pw){
//        this.id = id;
//        this.pw = pw;
//    }
//
//    public User(String id, String pw, String firstname){
//        this.id = id;
//        this.pw = pw;
//        this.firstname=firstname;
//    }

//    public int getCode() {
//        return code;
//    }

//    public void setCode(int code) {
//        this.code = code;
//    }

//    public String getId() {
//        return id;
//    }

//    public void setId(String id) {
//        this.id = id;
//    }

//    public String getPw() {
//        return pw;
//    }

//    public void setPw(String pw) {
//        this.pw = pw;
//    }

//    public String getName() {
//        return name;
//    }

//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }

    // setter 메소드 대신 -> update(UserRequestDto를 받는) 메소드를 통해 처리
    public void update(UserRequestDto dto){
        this.pw = dto.getPw();
        this.PN = dto.getPN();
        this.email = dto.getEmail();
        this.address = dto.getAddress();
    }
}
