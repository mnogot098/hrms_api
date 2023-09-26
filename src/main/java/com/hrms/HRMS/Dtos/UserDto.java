package com.hrms.HRMS.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long USER_ID;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
    private String COUNTRY_CODE;
    private String PHONE;
    private String GENDER;
    private Date CREATED_AT;
    private Date UPDATED_AT;
    private String CREATED_BY;
    private String LAST_MODIFIED_BY;
    private Long ROLE_ID;
    private BigDecimal SALARY;
    private String ADRESS;
    private Date BIRTHDAY;
}
