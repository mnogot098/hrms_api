package com.hrms.HRMS.exceptions;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserNotFoundException extends UsernameNotFoundException {
    public UserNotFoundException(Long userId) {
        super("User with ID " + userId + " not found.");
    }
}