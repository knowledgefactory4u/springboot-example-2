package com.knowledgefactory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.knowledgefactory.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
