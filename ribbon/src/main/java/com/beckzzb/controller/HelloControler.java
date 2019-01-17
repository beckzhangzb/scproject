package com.beckzzb.controller;

import com.beckzzb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * @author zhangzb
 * @since 2019/1/14 15:31
 */
@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    /**
     * rest 调用接口
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        System.out.println("hi:" + name);
        return helloService.hiService(name);
    }

    /**
     * rest 调用接口
     * @param info
     * @return
     */
    @RequestMapping(value = "/my/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String infoTest(@RequestParam String info) {
        return "return info:" + info;
    }
}
