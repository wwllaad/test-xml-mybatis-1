package com.bve.controller;

import com.bve.model.User;
import com.bve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    private String doTest(){
        return "TEST";
    }

    @GetMapping("/get")
    private User get(@RequestParam int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getAll")
    private List<User> getAll() {
        return userService.getAll();
    }
}
