package com.cms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cms.demo.entity.User;;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
