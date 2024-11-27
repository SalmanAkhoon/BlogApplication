package com.blog.blogapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.blog.blogapp.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}