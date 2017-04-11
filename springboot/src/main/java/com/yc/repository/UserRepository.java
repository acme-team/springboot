package com.yc.repository;

import org.springframework.data.repository.CrudRepository;

import com.yc.entity.User;


public interface UserRepository extends CrudRepository<User, Long>{

}
