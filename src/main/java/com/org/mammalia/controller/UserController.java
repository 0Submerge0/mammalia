package com.org.mammalia.controller;

import com.org.mammalia.pojo.Admin;
import com.org.mammalia.pojo.User;
import com.org.mammalia.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String, Object> userLogin(HttpSession session, String username, String password) {
        Map<String, Object> map = new HashMap<>();
        User user = userService.inquireUserByEmailOrPhone(username);
        if (user != null) {
            if (user.getUserPassword().equals(password)) {
                session.setAttribute("username", user);
                session.setAttribute("isAdmin", true);
                map.put("result", true);
            } else map.put("result", false);
        } else map.put("result", false);
        return map;
    }

    @RequestMapping(value = "/register")
    public Map<String, Object> userRegister(HttpSession session, User user) {
        Map<String, Object> map = new HashMap<>();
        User result = userService.userRegister(user);
        map.put("result", result != null);
        session.setAttribute("user", result);
        return map;
    }

    @RequestMapping(value = "/userList")
    public Map<String, Object> inquireUserList() {
        Map<String, Object> map = new HashMap<>();
        map.put("datalist", userService.inquireAllUser());
        return map;
    }

    @RequestMapping(value = "/addUser")
    public Map<String, Object> addUser(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", userService.addUser(user) == 1);
        return map;
    }

    @RequestMapping(value = "/deleteUserById")
    public Map<String, Object> deleteUserById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", userService.deleteUserById(id) == 1);
        return map;
    }


    @RequestMapping("/updateUserById")
    public Map<String, Object> updatUserById(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", userService.updateUserById(user) == 1);
        return map;
    }


}
