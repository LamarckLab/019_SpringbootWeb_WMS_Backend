package com.wms.controller;

import com.wms.pojo.User;
import com.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping("/list")
    public List<User> printAllUsers(){
        return userService.list();
    }

    @CrossOrigin
    @PostMapping("/save")
    public boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @CrossOrigin
    @PostMapping("/mod")
    public boolean modUser(@RequestBody User user){
        return userService.modUser(user);
    }

    @CrossOrigin
    @GetMapping("/del")
    public boolean delUser(int id){
        return userService.delUser(id);
    }

    @CrossOrigin
    @GetMapping("/queryById")
    public User getUserById(int id){
        return userService.getUserById(id);
    }

    @CrossOrigin
    @GetMapping("/queryByInfo")
    public List<User> getUsersByInfo(String no, Integer age ){
        return userService.getUserByInfo(no, age);
    }
}
