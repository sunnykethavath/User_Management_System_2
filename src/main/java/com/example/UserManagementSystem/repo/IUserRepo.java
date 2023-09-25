package com.example.UserManagementSystem.repo;

import com.example.UserManagementSystem.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Integer> {

}
