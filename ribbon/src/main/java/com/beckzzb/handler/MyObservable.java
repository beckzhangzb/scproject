package com.beckzzb.handler;

import rx.Observable;

/**
 * 集成观察者
 * @author zhangzb
 * @since 2019/1/14 18:49
 */
public class MyObservable extends Observable {

    protected MyObservable(OnSubscribe f) {
        super(f);
    }
}
