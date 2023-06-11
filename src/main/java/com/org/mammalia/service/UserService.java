package com.org.mammalia.service;

import com.org.mammalia.pojo.Admin;
import com.org.mammalia.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int addAdmin(Admin admin);

    int deleteUserById(Integer id);

    int deleteAdminById(Integer id);

    int updateUserById(User user);

    int updateAdminById(Admin admin);

    User inquireUserById(Integer id);

    User inquireUserByName(String name);

    User inquireUserByEmailOrPhone(String account);

    Admin inquireAdminByEmailOrPhone(String account);

    User userRegister(User user);

    List<Admin> inquireAllAdmin();

    List<User> inquireAllUser();
}
