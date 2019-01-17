package com.beckzzb.service.impl;

import com.beckzzb.service.CallService;
import org.springframework.stereotype.Component;

/**
 * 实现来
 * @author zhangzb
 * @since 2019/1/15 14:12
 */
@Component
public class CallServiceHystric implements CallService {
    @Override
    public String sayHiFromClient(String name) {
        return "Error happend, sorry " + name;
    }
}
