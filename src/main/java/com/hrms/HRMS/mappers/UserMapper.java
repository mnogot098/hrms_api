package com.hrms.HRMS.mappers;

import com.hrms.HRMS.Dtos.UserDto;
import com.hrms.HRMS.Entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto mapToDTO(User user) {
        UserDto userDTO = new UserDto();
        userDTO.setUSER_ID(user.getUSER_ID());
        userDTO.setFIRST_NAME(user.getFIRST_NAME());
        userDTO.setLAST_NAME(user.getLAST_NAME());
        userDTO.setPHONE(user.getPHONE());
        userDTO.setGENDER(user.getGENDER());
        userDTO.setEMAIL(user.getEMAIL());
        userDTO.setCOUNTRY_CODE(user.getCOUNTRY_CODE());
        userDTO.setSALARY(user.getSALARY());
        userDTO.setADRESS(user.getADRESSE());
        userDTO.setBIRTHDAY(user.getBIRTHDAY());
        return userDTO;
    }

    public User mapToEntity(UserDto userDTO) {
        User user = new User();
        user.setUSER_ID(userDTO.getUSER_ID());
        user.setFIRST_NAME(userDTO.getFIRST_NAME());
        user.setLAST_NAME(userDTO.getLAST_NAME());
        user.setPHONE(userDTO.getPHONE());
        user.setGENDER(userDTO.getGENDER());
        user.setEMAIL(userDTO.getEMAIL());
        user.setCOUNTRY_CODE(userDTO.getCOUNTRY_CODE());
        user.setSALARY(userDTO.getSALARY());
        user.setADRESSE(userDTO.getADRESS());
        user.setBIRTHDAY(userDTO.getBIRTHDAY());
        // Set other fields as needed
        return user;
    }
}

