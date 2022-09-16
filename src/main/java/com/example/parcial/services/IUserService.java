package com.example.parcial.services;

import com.example.parcial.models.User;
import com.example.parcial.models.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface IUserService {
    List<UserDTO> getAll();

    User getById(Long id);

    User createUser(User user);

    Boolean deleteById(Long id);
}
