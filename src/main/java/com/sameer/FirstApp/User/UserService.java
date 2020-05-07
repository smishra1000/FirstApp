package com.sameer.FirstApp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private List<UserRepository.User> users = new ArrayList<>();
    public List<UserRepository.User> getUsers() {
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public UserRepository.User getUserById(String id) {
         return userRepository.findById(id).orElse(null);
    }
    public void addUser(UserRepository.User user) {
        userRepository.save(user);
    }
    public void updateUser(UserRepository.User user, String id) {
       userRepository.save(user);

    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
