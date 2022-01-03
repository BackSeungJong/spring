package com.loginserverboot.loginserverboot.service;

import com.loginserverboot.loginserverboot.domain.User;
import com.loginserverboot.loginserverboot.domain.UserRepo;
import com.loginserverboot.loginserverboot.domain.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;

@Service // 서비스담당
@RequiredArgsConstructor
public class UserService {

    private final UserRepo repo;

    // 데이터 CRUD
    // 1. Create
    public User createUser(UserRequestDto dto){
        User newUser = new User(dto);
        return repo.save(newUser);
    }

    // 2. Read
    public User getUser(int code){ // {}로 부터 가져온 인자를 여기다 붙여라
        User user= null;
        //user = new User(new UserRequestDto("apple","1234","김사과"));
        user = repo.findById(code).orElseThrow(
                // 람다식
                () -> new IllegalArgumentException("존재하지 않는 사용자입니다.")
        );
        return user;
    }

    // getUsers 메소드 완성 -> 디엠으로 제출 (결과값 포함해서)
    public List<User> getUsers(){

        return repo.findAll();
    }

    // 3. Update
    @Transactional // 기존의 테이블에 쿼리가 일어나야함을 알려줌
    public User updateUser(int code, UserRequestDto dto){
        User user = getUser(code);
        user.update(dto);
        return user;
    }

    // 4. Delete
    @Transactional
    public int deleteUser(int code){
        User user = getUser(code);
        repo.deleteById(user.getCode());
        return user.getCode();
    }

}
