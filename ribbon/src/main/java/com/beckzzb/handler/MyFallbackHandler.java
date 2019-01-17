package com.beckzzb.handler;

import com.netflix.hystrix.HystrixInvokableInfo;
import com.netflix.ribbon.hystrix.FallbackHandler;
import rx.Observable;

import java.util.Map;

/**
 * 熔断返回的handler
 * @author zhangzb
 * @since 2019/1/14 18:34
 */
public class MyFallbackHandler implements FallbackHandler {
    @Override
    public Observable getFallback(HystrixInvokableInfo hystrixInvokableInfo, Map map) {
        Observable.OnSubscribe onSubscribe = new MyOnSubscribe();
        MyObservable myObservable = new MyObservable(onSubscribe);
        System.out.println("cacheKey:" + hystrixInvokableInfo.getPublicCacheKey()
                + " commandKey:" + hystrixInvokableInfo.getCommandKey()
                + " metrics:" + hystrixInvokableInfo.getMetrics()
                + " ,sorry,error!");

        return myObservable;
    }
}
