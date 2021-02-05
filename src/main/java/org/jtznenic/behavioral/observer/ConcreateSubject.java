package org.jtznenic.behavioral.observer;

/**
 * 具体主题 角色
 */
public class ConcreateSubject extends Subject {

    public void doSomething() {
        System.out.println("已处理，发送消息");
        super.notifyObservers();
    }

}
