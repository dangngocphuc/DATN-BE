package com.example.daphoneapple.api;

import com.example.daphoneapple.domain.constant.UserConstant;
import com.example.daphoneapple.domain.dto.req.ReqUserDto;
import com.example.daphoneapple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class UserApi {
    @Autowired
    private UserService userService;

    @GetMapping(UserConstant.API_USER_FIND_BY_ID)
    public ResponseEntity<?> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(this.userService.findById(id), HttpStatus.OK);
    }
//    @GetMapping(UserConstant.API_USER_FIND_)
//    public ResponseEntity<?> findById(@PathVariable("id") Long id){
//        return new ResponseEntity<>(this.userService.findById(id), HttpStatus.OK);
//    }
    @GetMapping(UserConstant.API_USER_FIND_ALL)
    public ResponseEntity<?> findAll(@RequestParam("page") Optional<Integer> page,
                                     @RequestParam("size") Optional<Integer> size) {
        Pageable pageable = PageRequest.of(page.orElse(1) - 1, size.orElse(9), Sort.Direction.DESC, "createDate");
        return new ResponseEntity<>(this.userService.findAllSecond(pageable), HttpStatus.OK);
    }
    @PostMapping(UserConstant.API_USER_CREATE)
    public ResponseEntity<?> create(@RequestBody @Valid ReqUserDto reqUserDto) {
        return new ResponseEntity<>(this.userService.save(reqUserDto), HttpStatus.OK);
    }



}
