package com.knowledgefactory.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.knowledgefactory.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
