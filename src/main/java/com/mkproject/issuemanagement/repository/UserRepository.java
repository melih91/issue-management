package com.mkproject.issuemanagement.repository;

import com.mkproject.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Melih 21.05.2019
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
