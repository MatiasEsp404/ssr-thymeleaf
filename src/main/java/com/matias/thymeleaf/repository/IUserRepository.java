package com.matias.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.matias.thymeleaf.model.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Integer> {

}
