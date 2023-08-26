package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public void updateUser(Long id, User user);

    public void removeUser(User user);

    public User getUserById(Long id);

    public List<User> getListUser();

}
