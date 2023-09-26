package com.hrms.HRMS.ServicesImpl;

import com.hrms.HRMS.Dtos.UserDto;
import com.hrms.HRMS.Entities.User;
import com.hrms.HRMS.Repositories.UserRepository;
import com.hrms.HRMS.Services.UserService;
import com.hrms.HRMS.exceptions.UserNotFoundException;
import com.hrms.HRMS.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserDto> getAll() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
        return userMapper.mapToDTO(user);
    }

    @Transactional
    public UserDto createUser(UserDto userDto) {
        // Convert the DTO to a User entity
        User user = userMapper.mapToEntity(userDto);

        // Save the user entity to the database
        User savedUser = userRepository.save(user);

        // Convert the saved user entity back to a DTO and return it
        return userMapper.mapToDTO(savedUser);
    }

    @Transactional
    public UserDto deleteUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
        // Check if the user exists
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }

        // Delete the user by ID
        return userMapper.mapToDTO(user);

    }

    /*@Transactional
    public UserDto updateUser(Long userId, UserDto userDto) {
        // Check if the user exists
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

        // Update the user entity with data from the DTO
        existingUser.setUsername(userDto.getUsername());
        existingUser.setEmail(userDto.getEmail());

        // Save the updated user entity
        User updatedUser = userRepository.save(existingUser);

        // Convert the updated user entity back to a DTO and return it
        return userMapper.mapToDto(updatedUser);
    }
    */
}
