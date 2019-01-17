package com.beckzzb.service;

import com.beckzzb.service.impl.CallServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调第三方服务接口
 * @author zhangzb
 * @since 2019/1/15 12:26
 */
@Service
@FeignClient(value = "service-hi", fallback = CallServiceHystric.class)
public interface CallService {

    /**
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
