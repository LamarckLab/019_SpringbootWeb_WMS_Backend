package com.wms.service;

import com.wms.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list();  // UserController类中的list接口会调用这个方法

    boolean addUser(User user);

    boolean modUser(User user);

    boolean delUser(int id);

    User getUserById(int id);

    List<User> getUserByInfo(String no,Integer age);
}
