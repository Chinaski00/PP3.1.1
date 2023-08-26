package com.example.demo.service;


import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(Long id, User user);

    void removeUser(User user);

    User getUserById(Long id);

    List<User> getListUser();
}
