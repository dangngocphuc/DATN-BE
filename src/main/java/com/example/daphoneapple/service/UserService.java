package com.example.daphoneapple.service;

import com.example.daphoneapple.domain.dto.req.ReqUserDto;
import com.example.daphoneapple.entity.User;

import org.springframework.data.domain.Pageable;
import java.util.List;


public interface UserService {
    User findById(Long id);

    ReqUserDto findByUsername(String username);

    List<ReqUserDto> findAllSecond(Pageable pageable);

    User save(ReqUserDto reqUserDto);


}