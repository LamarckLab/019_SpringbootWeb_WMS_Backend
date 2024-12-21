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
    public List<User> list() {
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
    public boolean delUser(Integer id) {
        return userMapper.delUser(id);  // 调用UserMapper中的delUser方法
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);  // 调用UserMapper中的getUserById方法
    }

    @Override
    public List<User> getUserByInfo(String no, Integer age) {
        return userMapper.getUsersByInfo(no, age);  // 调用UserMapper中的getUserByInfo方法
    }

//    @Override
//    public List<User> listByName(String name) {
//        if (name != null && !name.isEmpty()) {  // 如果传入的name不为null且不为空,执行UseMapper中的findByName方法
//            return userMapper.findByName(name);
//        } else {
//            return userMapper.list();  // 如果name为null或不为空，执行UserMapper中的list方法
//        }
//    }

    @Override
    public List<User> listByNameAndSex(String name, Integer sex) {
        if (name != null && !name.isEmpty() && sex != null) {
            return userMapper.findByNameAndSex(name, sex);
        }
        else if(name != null && !name.isEmpty()){
            return userMapper.findByName(name);
        }
        else if(sex != null){
            return userMapper.findBySex(sex);
        }
        else{
            return userMapper.list();
        }
    }

}


