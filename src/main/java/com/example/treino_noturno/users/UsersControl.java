package com.example.treino_noturno.users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersControl {

    private final UserService service;

    public UsersControl(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<UsersResponseDto> findAllUsers(){
        return service.findAllUsers();
    }
    @PostMapping("/users")
    public UsersResponseDto saveUser(
            @RequestBody UsersDto dto
    ){
        return service.saveUsers(dto);
    }

    @GetMapping("/users/{user-id}")
    public UsersResponseDto findUserById(
            @PathVariable("user-id") int id
    ){
        return service.findUserById(id);
    }
    @DeleteMapping("/users/{user-id}")
    public void deleteUserById(
            @PathVariable("user-id") int id
    ){
        service.deleteUserById(id);
    }
}
