package com.angelicamello.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.angelicamello.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

