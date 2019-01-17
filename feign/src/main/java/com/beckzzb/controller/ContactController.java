package com.beckzzb.controller;

import com.beckzzb.service.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 * @author zhangzb
 * @since 2019/1/15 12:29
 */
@RestController
public class ContactController {
    @Autowired
    private CallService callService;

    /**
     * 打招呼controller
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = {RequestMethod.GET, RequestMethod.POST})
    public String sayHi(@RequestParam String name){
        return callService.sayHiFromClient(name);
    }
}
