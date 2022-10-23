package com.example.daphoneapple.repository;

import com.example.daphoneapple.domain.dto.req.ReqUserDto;
import com.example.daphoneapple.entity.User;

import java.util.Optional;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

    ReqUserDto findUserByUsername(String username);

    @Query("SELECT DISTINCT u,r.name FROM User u " +
            "INNER JOIN UserRole ur ON u.Id = ur.user.Id " +
            "INNER JOIN Role r ON r.id = ur.role.id")
    List<ReqUserDto> findAllSecond(Pageable pageable);

    List<ReqUserDto> findUserByEmail(String email);

}