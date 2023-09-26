package com.hrms.HRMS.Repositories;

import com.hrms.HRMS.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
