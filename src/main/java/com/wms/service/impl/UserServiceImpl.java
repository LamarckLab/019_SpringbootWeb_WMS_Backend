package com.wms.service.impl;

import com.wms.mapper.UserMapper;
import com.wms.pojo.User;
import com.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list(){
        return userMapper.list();  // 调用UserMapper中的list方法
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);  // 调用UserMapper中的addUser方法
    }

    @Override
    public boolean modUser(User user) {
        return userMapper.modUser(user);  // 调用UserMapper中的modUser方法
    }

    @Override
    public boolean delUser(int id) {
        return userMapper.delUser(id);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserByInfo(String no, Integer age) {
        return userMapper.getUsersByInfo(no, age);
    }
}
