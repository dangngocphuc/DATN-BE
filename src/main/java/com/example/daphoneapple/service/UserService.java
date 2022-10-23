package com.example.daphoneapple.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.example.daphoneapple.domain.dto.req.ReqUserDto;
import com.example.daphoneapple.entity.User;

public interface UserService {
    User findById(Long id);

    ReqUserDto findByUsername(String username);

    List<ReqUserDto> findAllSecond(Pageable pageable);

    User save(ReqUserDto reqUserDto);

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}