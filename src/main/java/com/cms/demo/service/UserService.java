package com.cms.demo.service;


import com.cms.demo.dto.UserDto;
import com.cms.demo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}