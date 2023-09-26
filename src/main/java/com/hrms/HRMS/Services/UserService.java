package com.hrms.HRMS.Services;

import com.hrms.HRMS.Dtos.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAll();
    UserDto getUserById(Long id);
    UserDto createUser(UserDto userDto);
    UserDto deleteUser(Long userId);
}
