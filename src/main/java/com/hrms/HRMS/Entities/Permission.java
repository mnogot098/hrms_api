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
@Table(name="permissions")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PERMISSION_ID;

    private String PERMISSION_NAME;

    private String PERMISSION_DESCRIPTION;


    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "permission_module",
            joinColumns = @JoinColumn(name = "permission_id"),
            inverseJoinColumns = @JoinColumn(name = "module_id")
    )
    private Set<Module> modules = new HashSet<>();

}