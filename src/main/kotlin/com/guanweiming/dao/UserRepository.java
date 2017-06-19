package com.guanweiming.dao;

import com.guanweiming.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author https://github.com/zziaguan/
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByName(String name);
}
