package com.example.treino_noturno.users;

import org.springframework.stereotype.Service;

@Service
public class UsersMapper {
    public UsersResponseDto toUsersResponseDto(Users usr){
        return new UsersResponseDto(usr.getFirst_name(), usr.getLast_name());
    }
    public Users toUsers(UsersDto dto){
        return new  Users(dto.first_name(), dto.last_name(), dto.email());
    }
    public UsersDto toUsersDto(Users usr){
        return new UsersDto(usr.getFirst_name(), usr.getLast_name(), usr.getEmail());
    }
}
