package com.atguigu.springmvc.handlers;

import com.atguigu.springmvc.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("mvc")
public class HelloWorld {
    private static final String SUCCESS = "success";

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map) {
        map.put("names",Arrays.asList("tom","jerry","mike"));
        System.out.println(map.getClass().getName());
        return SUCCESS;
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time", new Date());
        return modelAndView;
    }


    @RequestMapping("/testservletAPI")
    public void testservletAPI(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Writer writer) throws IOException {
        System.out.println(httpServletRequest);
        System.out.println(httpServletResponse);
        writer.write("hollospringmvc");
    }


    @RequestMapping("/testpojo")
    public String testpojo(User user) {
        System.out.println(user);
        return SUCCESS;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println("cookie:" + cookie);
        return SUCCESS;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String header) {
        System.out.println("Accept-Language:" + header);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String username, @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println("username:" + username + ",age:" + age);
        return SUCCESS;
    }

    @RequestMapping(value = "/testmethod", method = {RequestMethod.POST, RequestMethod.GET})
    public String testMethod() {
        return SUCCESS;
    }

    @RequestMapping("/helloworld")
    public String hello() {
        return SUCCESS;
    }

    @RequestMapping(value = "/param", params = {"username", "age!=10"}, headers = {"Accept-Language=zh-CN,zh;q=0.9"})
    public String helloParam() {
        return SUCCESS;
    }

    @RequestMapping("/ant/**/abc")
    public String helloAnt() {
        return SUCCESS;
    }

    @RequestMapping("/testPathVariable/{id}")
    public String helloPathVariable(@PathVariable("id") Integer id) {
        System.out.println(id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testget/{id}", method = RequestMethod.GET)
    public String hellotestget(@PathVariable("id") Integer id) {
        System.out.println("testget" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testpsot", method = RequestMethod.POST)
    public String hellotestpstestdeleteot() {
        System.out.println("testpsot");
        return SUCCESS;
    }

    @ResponseBody
    @RequestMapping(value = "/testdelete/{id}", method = RequestMethod.DELETE)
    public String hellotestdelete(@PathVariable("id") Integer id) {
        System.out.println("testputdelete" + id);
        return SUCCESS;
    }

    @ResponseBody
    @RequestMapping(value = "/testput/{id}", method = RequestMethod.PUT)
    public String hellotestput(@PathVariable("id") Integer id) {
        System.out.println("testput" + id);
        return SUCCESS;
    }


}
