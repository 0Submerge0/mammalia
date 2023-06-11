package com.org.mammalia.service.impl;

import com.org.mammalia.pojo.Admin;
import com.org.mammalia.pojo.User;
import com.org.mammalia.mapper.UserMapper;
import com.org.mammalia.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int addAdmin(Admin admin) {
        return userMapper.addAdmin(admin);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int deleteAdminById(Integer id) {
        return userMapper.deleteAdminById(id);
    }

    @Override
    public int updateUserById(User user) {
        return userMapper.updateUserById(user);
    }

    @Override
    public int updateAdminById(Admin admin) {
        return userMapper.updateAdminById(admin);
    }

    @Override
    public User inquireUserById(Integer id) {
        return userMapper.inquireUserById(id);
    }

    @Override
    public User inquireUserByName(String name) {
        return userMapper.inquireUserByName(name);
    }

    @Override
    public User inquireUserByEmailOrPhone(String account) {
        return userMapper.inquireUserByEmailOrPhone(account);
    }

    @Override
    public Admin inquireAdminByEmailOrPhone(String account) {
        return null;
    }

    @Override
    public User userRegister(User user) {
        if (userMapper.inquireUserByEmailOrPhone(user.getUserEmail()) == null) {
            String account = user.getUserPhone();
            if (user.getUserEmail() == null)
                user.setUserEmail("");
            else
                account = user.getUserEmail();
            userMapper.addUser(user);
            return userMapper.inquireUserByEmailOrPhone(account);
        } else return null;
    }

    @Override
    public List<Admin> inquireAllAdmin() {
        return userMapper.inquireAllAdmin();
    }


    @Override
    public List<User> inquireAllUser() {
        return userMapper.inquireAllUsers();
    }
}
