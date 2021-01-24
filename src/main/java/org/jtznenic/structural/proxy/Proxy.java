package org.jtznenic.structural.proxy;

/**
 * 代理
 */
public class Proxy implements ISubject, IProxy {
    private ISubject subject;
    private int count;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
        this.count++;
    }

    private void before() {
        System.out.println("代理前置增强");
    }

    private void after() {
        System.out.println("代理后置增强");
    }

    @Override
    public int count() {
        return this.count;
    }
}
