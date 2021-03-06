package com.loginserverboot.loginserverboot.controller;

import com.loginserverboot.loginserverboot.domain.User;
import com.loginserverboot.loginserverboot.domain.UserRequestDto;
import com.loginserverboot.loginserverboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // 맵핑 담당
@RequiredArgsConstructor
public class UserController {

    // api 구현
    private final UserService service;
    // 데이터 CRUD

    // 1. Create
    @PostMapping("/v1/users")
    public User createUser(@RequestBody UserRequestDto dto){
        return service.createUser(dto);
    }

    // 2. Read
    @PostMapping("/v1/users/{id}") //{}에 값을 인자로 가져올 수 있따.
    public User getUser(@PathVariable String id){ // {}로 부터 가져온 인자를 여기다 붙여라

        return service.getUser(id);
    }
    // getUsers 메소드 완성 -> 디엠으로 제출 (결과값 포함해서)
    @GetMapping("/v1/users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    // 3. Update
    @PutMapping("/v1/users/{id}")
    public User updateUser(@PathVariable String id,@RequestBody UserRequestDto dto){
        return service.updateUser(id, dto);
    }

    // 4. Delete
    @DeleteMapping("/v1/users/{id}")
    public String deleteUser(@PathVariable String id){
        return service.deleteUser(id);
    }
}
