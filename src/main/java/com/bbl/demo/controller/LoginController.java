package com.bbl.demo.controller;

import com.bbl.demo.common.constant.Constant;
import com.bbl.demo.entity.UserEntity;
import com.bbl.demo.exception.CodeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
@RestController
@RequestMapping("/public")
public class LoginController {

    @RequestMapping("/login")
    public void login(HttpSession session, String username, String password)  {
        UserEntity u = new UserEntity();
        u.setUsername("test");
        u.setPassword("123456");
        if (! (u.getUsername().equals(username) && u.getPassword().equals(password))) {
            throw new CodeException("LOGIN_ERROR", "用户名或密码错误");
        }
        session.setAttribute(Constant.SESSION_USER, u);
    }

    @RequestMapping("/logout")
    public void logout(HttpSession session)  {
        session.invalidate();
        return;
    }


}
