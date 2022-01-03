package com.loginserverboot.loginserverboot.util;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 나(Timestamped- 부모)를 상속받은 자식 클래스가 자동으로 컬럼(맴버)을 부여받을 수 있게 설정
@EntityListeners(AuditingEntityListener.class) // 테이블에 변화가 있을 때 캐치하기 위한 리스너
public class Timestamped {
    // data.annotation 으로 각 칼럼(맴버)가 어떤 내용인지 구체적으로 명시
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
