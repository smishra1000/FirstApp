package com.sameer.FirstApp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/users")
    public List<UserRepository.User> getAllusers(){
        return userService.getUsers();
    }
    @RequestMapping("/users/{id}")
    public UserRepository.User getUserBuId(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/users")
    public void addUser(@RequestBody UserRepository.User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/users/{id}")
    public void addUser(@RequestBody UserRepository.User user, @PathVariable String id) {
        userService.updateUser(user,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/users/{id}")
    public void addUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

}
