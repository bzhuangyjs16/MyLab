package com.wildCrane.service;

import com.wildCrane.entity.User;
import com.wildCrane.exception.ServiceException;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialException;

@Service
public class UserService {
    public User insert(User user) {
        if(user!=null){
            throw new ServiceException("参数格式错误");
        }
        return user;
    }
}
