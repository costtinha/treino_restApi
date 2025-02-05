package com.example.treino_noturno.users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UsersRepository repository;
    private final UsersMapper mapper;

    public UserService(UsersRepository repository, UsersMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<UsersResponseDto> findAllUsers() {
        return repository.findAll()
                .stream()
                .map(mapper::toUsersResponseDto)
                .collect(Collectors.toList());
    }

    public UsersResponseDto saveUsers(UsersDto dto) {
        return mapper.toUsersResponseDto(repository.save(mapper.toUsers(dto)));
    }

    public UsersResponseDto findUserById(int id) {
        return mapper.toUsersResponseDto(repository.findById(id).orElse(null));
    }

    public void deleteUserById(int id) {
        repository.deleteById(id);
    }
}
