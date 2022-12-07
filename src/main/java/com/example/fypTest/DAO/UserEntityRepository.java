package com.example.fypTest.DAO;

import com.example.fypTest.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByIdEquals(Integer id);

}