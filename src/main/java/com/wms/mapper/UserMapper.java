package com.wms.mapper;

import com.wms.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    // 请求User表中的全部用户
    List<User> list();

    // User表中添加用户
    boolean addUser(User user);

    // 更新User表中的某个用户信息
    boolean modUser(User user);

    // 删除User表中的某个用户（基于id）
    boolean delUser(int id);

    // 查询User表中的某个用户（基于id）
    User getUserById(int id);

    // 根据多条信息查询User表中的用户（no模糊查询 age精确查询）
    List<User> getUsersByInfo(String no, Integer age);

    // 根据姓名进行模糊查询
    List<User> findByName(String name);
}
