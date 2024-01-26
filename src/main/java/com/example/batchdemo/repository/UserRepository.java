package com.example.batchdemo.repository;

import com.example.batchdemo.pojo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
