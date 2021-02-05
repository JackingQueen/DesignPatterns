package org.jtznenic.behavioral.observer;

/**
 * guava 具体主题角色
 */
public class GuavaConcreateSubject extends GuavaSuject {
    public void doSomething() {
        super.post("guava 具体主题角色");
    }
}
