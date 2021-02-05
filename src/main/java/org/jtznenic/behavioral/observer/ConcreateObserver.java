package org.jtznenic.behavioral.observer;

/**
 * 具体观察者 角色
 */
public class ConcreateObserver implements Observer {
    @Override
    public void update() {
        System.out.println("收到通知");
    }

}
