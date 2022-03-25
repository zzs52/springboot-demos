package com.zzs.controller;

import cn.hutool.core.lang.Dict;
import com.zzs.entity.User;
import com.zzs.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public Dict save(@RequestBody User user) {
        Boolean save = userService.save(user);
        return Dict.create().set("code", save ? 200 : 500).set("msg", save ? "成功" : "失败").set("data", save ? user : null);
    }

    @DeleteMapping("/user/{id}")
    public Dict delete(@PathVariable Long id) {
        Boolean delete = userService.delete(id);
        return Dict.create().set("code", delete ? 200 : 500).set("msg", delete ? "成功" : "失败");
    }

    @PutMapping("/user/{id}")
    public Dict update(@RequestBody User user, @PathVariable Long id) {
        Boolean update = userService.update(user, id);
        return Dict.create().set("code", update ? 200 : 500).set("msg", update ? "成功" : "失败").set("data", update ? user : null);
    }

    @GetMapping("/user/{id}")
    public Dict getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        return Dict.create().set("code", 200).set("msg", "成功").set("data", user);
    }

    @GetMapping("/user")
    public Dict getUser(User user) {
        List<User> userList = userService.getUser(user);
        return Dict.create().set("code", 200).set("msg", "成功").set("data", userList);
    }
}
