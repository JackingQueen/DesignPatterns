package org.jtznenic.behavioral.observer;

import com.google.common.eventbus.Subscribe;

/**
 * guava 具体观察者角色
 */
public class GuavaConcreateObserver {

    @Subscribe
    public void subscribe(Object event) {
        System.out.println(event);
    }
}
