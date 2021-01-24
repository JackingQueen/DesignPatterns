package org.jtznenic.structural.proxy;

/**
 * 真实主题
 */
public class RealSubject implements ISubject{

    @Override
    public void request() {
        System.out.println("真实主题处理");
    }

}
