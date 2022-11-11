package com.carlos.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.finalproject.persist.UsersAppEntity;

public interface UserRepository extends JpaRepository<UsersAppEntity, Long>{

}
