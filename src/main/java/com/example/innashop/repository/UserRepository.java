package com.example.innashop.repository;

import com.example.innashop.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUsername(String userName);
}
