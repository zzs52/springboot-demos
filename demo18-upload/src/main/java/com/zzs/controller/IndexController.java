package com.zzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Desc:首页Controller
 * @author zzs
 * @date 2022/3/27 13:01
 */
@Controller
public class IndexController {

    @GetMapping("")
    public String index() {
        return "index";
    }
}
