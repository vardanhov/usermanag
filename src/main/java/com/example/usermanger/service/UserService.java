package com.example.usermanger.service;

import com.example.usermanger.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    List<User> getAllUser();

    void delete(Long id);

    User getUserById(Long id);

    void save(User user);

    void update(User user);

}
