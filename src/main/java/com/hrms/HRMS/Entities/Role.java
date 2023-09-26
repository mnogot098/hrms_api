package com.hrms.HRMS.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ROLE_ID;

    private String ROLE_NAME;

    private String ROLE_DESCRIPTION;

    @OneToMany(mappedBy = "role") // This maps the relationship to the "role" field in the User entity
    private List<User> users;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "role_permission",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "permission_id")}
    )
    private Set<Permission> permissions = new HashSet<>();

}