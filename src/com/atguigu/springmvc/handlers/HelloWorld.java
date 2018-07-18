package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("mvc")
public class HelloWorld {
    private static final String SUCCESS = "success";

    @RequestMapping(value="/testmethod",method = {RequestMethod.POST,RequestMethod.GET })
    public String testMethod() {
        return SUCCESS;
    }

    @RequestMapping("/helloworld")
    public String hello() {
        return SUCCESS;
    }

    @RequestMapping(value = "/param",params = {"username","age!=10"},headers = {"Accept-Language=zh-CN,zh;q=0.9"})
    public String helloParam() {
        return SUCCESS;
    }
}
