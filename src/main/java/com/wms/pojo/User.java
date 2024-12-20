package com.wms.pojo;

// pojo文件夹是用来存放与数据库对应的实体类
// User实体类对应的是数据库中的User表
public class User {
    private Integer id;  // User表中的主键，自增
    private String no;  // 用户的账号
    private String name;  // 用户的姓名
    private String password;  // 用户的密码
    private Integer age;  // 用户的年龄
    private Integer sex;  // 用户的性别
    private String phone;  // 用户的电话
    private Integer roleId;  // 用户的角色类型 0超级管理员 1管理员 2用户

    // User实例的无参构造
    public User() {
    }

    // User实例的全参构造
    public User(Integer id, String no, String name, String password, Integer age, Integer sex, String phone, Integer roleId) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.roleId = roleId;
    }

    // 每个属性的Get Set方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    // User实例的toString方法
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
