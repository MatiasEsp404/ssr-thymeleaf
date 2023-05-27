package com.matias.thymeleaf.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.matias.thymeleaf.model.UserEntity;
import com.matias.thymeleaf.service.abs.IUserService;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public String showUsers(Model model) {
        List<UserEntity> users = userService.getAll();
        model.addAttribute("users", users);
        return "user-list";
    }

}

