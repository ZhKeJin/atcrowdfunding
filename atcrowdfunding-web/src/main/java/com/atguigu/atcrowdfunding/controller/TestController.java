package com.atguigu.atcrowdfunding.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * @author Zhangkj
 * @date 2019-04-28-16:29
 */


@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index(){
       return "index";
    }


}
