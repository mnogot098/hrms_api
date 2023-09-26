package com.hrms.HRMS.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long USER_ID;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
    private String COUNTRY_CODE;
    private String PHONE;
    private String GENDER;
    private String PASSWORD;
    //private int TEAM_ID;
    //private int DEPARTMENT_ID;
    //private int MANAGER_UD;
    //private int JOB_ID;
    //private int STATUS_ID;
    //private BLOB PROFILE_PICTURE;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_AT", updatable = false)
    @CreatedDate
    private Date  CREATED_AT;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_AT")
    @LastModifiedDate
    private Date UPDATED_AT;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String lastModifiedBy;

    private BigDecimal SALARY;
    private Date BIRTHDAY;

    //private Date LAST_LOGIN;
    //private int GROUP_ID;
    private String ADRESSE;
    private int ROLE_ID;
    //private String USER_TITLE;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role")
    private Role role;
}
