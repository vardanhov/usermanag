package com.example.usermanger.service;

import com.example.usermanger.model.User;
import com.example.usermanger.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> getAllUser() {

        return userRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void update(User user) {
        userRepository.setUserInfoById(user.getName(), user.getSurname(), user.getId());

    }
}
