package com.carlos.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.finalproject.persist.UsersTypeEntity;

public interface UserTypeRepository extends JpaRepository<UsersTypeEntity, Long>{

}
