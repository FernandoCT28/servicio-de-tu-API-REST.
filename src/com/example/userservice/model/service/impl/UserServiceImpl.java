package com.example.userservice.model.service.impl;

import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private final Map<String, User> userMap = new HashMap<>();

    @Override
    public User createUser(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User getUserById(String id) {
        return userMap.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public User updateUser(String id, User user) {
        userMap.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(String id) {
        userMap.remove(id);
    }
}