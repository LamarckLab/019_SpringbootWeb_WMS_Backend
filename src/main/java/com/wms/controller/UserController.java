package com.wms.controller;

import com.wms.pojo.User;
import com.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import java.util.HashMap;
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

    // 新增分页查询方法
    @CrossOrigin  // 允许进行跨域请求
    @GetMapping("/listPage")  // 定义了一个Get请求接口
    public HashMap<String, Object> getUserList(  // 该方法的返回类型是一个HashMap，用于封装分页数据
            @RequestParam(defaultValue = "1") int pageNum,  // pageNum的默认值是1  pageSize的默认值是5
            @RequestParam(defaultValue = "5") int pageSize) {
        // 启动分页功能
        PageHelper.startPage(pageNum, pageSize);
        // 获取所有用户数据
        List<User> users = userService.list();
        // PageInfo是PageHelper提供的工具类，在这里用于封装users的信息
        PageInfo<User> pageInfo = new PageInfo<>(users);
        // 创建了一个空的HashMap，用于封装返回给前端的数据
        HashMap<String, Object> result = new HashMap<>();
        // 把分页后的用户列表存入result中的data键中(这部分数据用于渲染表格)
        result.put("data", pageInfo.getList());
        // 把用户总记录数存入result中的total键中(这部分数据用来计算页数)
        result.put("total", pageInfo.getTotal());
        return result;
    }

}
