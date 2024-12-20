package com.wms.controller;

import com.wms.pojo.User;
import com.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;

// UserController类中存放的有关User的各种接口
@RestController  // 这个注解用来申明这个类是一个Controller类, 告诉Spring这是一个控制类
public class UserController {

    @Autowired  // 这是一个依赖注入注解，用来告诉Spring, Controller中需要一个UserService的实例
    private UserService userService;

    // 这个接口用于实现：打印User表中的全部条目
    @CrossOrigin  // 实现跨域请求的注解
    @GetMapping("/list")  // 访问的路径
    public List<User> printAllUsers(){
        return userService.list();  // 这里需要调用UserService中的方法
    }

    // 这个接口用于实现：向User表中添加数据
    @CrossOrigin
    @PostMapping("/save")
    public boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    // 这个接口用于实现：修改User表中某条数据
    @CrossOrigin
    @PostMapping("/mod")
    public boolean modUser(@RequestBody User user){
        return userService.modUser(user);
    }

    // 这个接口用于实现：删除User表中的某条数据
    @CrossOrigin
    @GetMapping("/del")
    public boolean delUser(int id){
        return userService.delUser(id);
    }

    // 这个接口用于实现：根据id查询User表中的某条数据
    @CrossOrigin
    @GetMapping("/queryById")
    public User getUserById(int id){
        return userService.getUserById(id);
    }

    // 这个接口用于实现：根据no（模糊查询）和age（精确查询）两条信息查询满足条件的条目
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
            @RequestParam(defaultValue = "5") int pageSize,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer sex){
        // 启动分页功能
        PageHelper.startPage(pageNum, pageSize);
        // 获取所有用户数据
//        List<User> users = userService.list();
        // 查询用户列表（条件查询:name）
//        List<User> users = userService.listByName(name);
        // 查询用户列表（条件查询:name、age）
        List<User> users = userService.listByNameAndSex(name, sex);
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