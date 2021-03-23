package com.myart.registration._login.repository;


import com.myart.registration._login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findAllByUsername(String username);
}
