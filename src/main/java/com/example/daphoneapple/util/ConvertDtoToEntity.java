package com.example.daphoneapple.util;

import com.example.daphoneapple.domain.dto.req.ReqOrderDto;
import com.example.daphoneapple.domain.dto.req.ReqUserDto;
import com.example.daphoneapple.entity.Order;
import com.example.daphoneapple.entity.User;
import com.example.daphoneapple.entity.UserRole;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ConvertDtoToEntity {
    public static Order fromReqOrderDto(ReqOrderDto reqOrderDto){
        Order order = new Order();
        order.setCustomerName(reqOrderDto.getCustomerName());
        order.setAddress(reqOrderDto.getAddress());
        order.setPhoneNumber(reqOrderDto.getPhoneNumber());
        order.setEmail(reqOrderDto.getEmail());
        order.setTotalPrice(reqOrderDto.getTotalPrice());
        order.setDescription(reqOrderDto.getDescription());
        order.setPayment(reqOrderDto.getPayment());
        order.setOrderCode("OD"+ getSaltString());
        order.setShipDate(Date.from(LocalDate.now().plusDays(5).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        return order;
    }
    public static User ReqCreateAccountDtoToAccount(ReqUserDto reqUserDto){
        User user = new User();
        user.setUsername(reqUserDto.getUsername());
        user.setPassword(reqUserDto.getPassword());
        user.setAddress(reqUserDto.getAddress());
        user.setEmail(reqUserDto.getEmail());
        user.setPhoneNumber(reqUserDto.getPhoneNumber());
        user.setGender(reqUserDto.getGender());
        user.setFullName(reqUserDto.getFullName());
        user.setStatus(true);
        UserRole userRole = new UserRole();
        userRole.setId(reqUserDto.getUserRoleId());
        user.setUserRoles((List<UserRole>) userRole);
        return user;
    }
    public static String getSaltString() {
        String SALTCHARS = "0123456789";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() <= 4) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
