package com.beckzzb.handler;

import rx.Observable;

/**
 * subscribe
 * @author zhangzb
 * @since 2019/1/14 18:42
 */
public class MyOnSubscribe implements Observable.OnSubscribe {

    @Override
    public void call(Object o) {
        System.out.println("in MyOnSubscribe");
    }
}
