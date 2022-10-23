package com.example.daphoneapple.service.impl;

import com.example.daphoneapple.domain.dto.req.ReqUserDto;
import com.example.daphoneapple.domain.exeption.ExceptionConfig;
import com.example.daphoneapple.entity.User;
import com.example.daphoneapple.repository.UserRepository;
import com.example.daphoneapple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public ReqUserDto findByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public List<ReqUserDto> findAllSecond(Pageable pageable) {
        return userRepository.findAllSecond(pageable);
    }

    @Override
    public User save(ReqUserDto reqUserDto) {
        if(this.userRepository.findUserByUsername(reqUserDto.getUsername()) != null){
            throw new ExceptionConfig("Username đã tồn tại");
        }
        if(this.userRepository.findUserByEmail(reqUserDto.getEmail()) != null){
            throw new ExceptionConfig("Email đã tồn tại");
        }
        return null;
    }
}