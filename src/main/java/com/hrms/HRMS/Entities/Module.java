package com.hrms.HRMS.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="modules")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MODULE_ID;

    private String MODULE_NAME;

    private String MODULE_DESCRIPTION;


    @ManyToMany(mappedBy = "modules")
    private Set<Permission> permissions = new HashSet<>();

}