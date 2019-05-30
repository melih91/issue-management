package com.mkproject.issuemanagement.service;

import com.mkproject.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Melih 22.05.2019
 */

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUsername(String username);
}
