package com.loginserverboot.loginserverboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository : SQL 문을 직접 쓰지 않고 -> Java 메소드로 -> 쿼리 실행을 할 수 있게 해줌
// JpaRepository 상속 ( 인터페이스 : 메소드 집합 )

public interface UserRepo extends JpaRepository<User, Integer> {
}
