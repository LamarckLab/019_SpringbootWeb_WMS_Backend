package com.wms.service;

import com.wms.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list();  // UserController类中的list接口会调用这个方法

    boolean addUser(User user);  // UserController类中的save接口会调用这个方法

    boolean modUser(User user);  // UserController类中的mod接口会调用这个方法

    boolean delUser(Integer id);  // UserController类中的del接口会调用这个方法

    User getUserById(int id);  // UserController类中的queryById接口会调用这个方法

    List<User> getUserByInfo(String no,Integer age);  // UserController类中的queryByInfo接口会调用这个方法

//    List<User> listByName(String name);  // UserController类中的分页查询会调用这个方法

    List<User> listByNameAndSex(String name, Integer sex);  // UserController类中的分页查询会调用这个方法

    User getUserByNo(String no);
}
