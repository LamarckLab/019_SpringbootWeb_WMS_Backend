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

    @PostMapping("/save")
    public boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("/mod")
    public boolean modUser(@RequestBody User user){
        return userService.modUser(user);
    }

    @GetMapping("/del")
    public boolean delUser(int id){
        return userService.delUser(id);
    }

    @GetMapping("/queryById")
    public User getUserById(int id){
        return userService.getUserById(id);
    }

    @GetMapping("/queryByInfo")
    public List<User> getUsersByInfo(String no, Integer age ){
        return userService.getUserByInfo(no, age);
    }
}
