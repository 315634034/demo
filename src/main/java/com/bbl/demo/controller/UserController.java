package com.bbl.demo.controller;

import com.bbl.demo.common.constant.Constant;
import com.bbl.demo.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/get")
    public UserEntity get(HttpSession session) {
        UserEntity currUser = (UserEntity)session.getAttribute(Constant.SESSION_USER);
        return currUser;
    }
}
