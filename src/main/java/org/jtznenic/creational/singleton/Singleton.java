package org.jtznenic.creational.singleton;

/**
 * 通用单例设计模式代码
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    // 限制产生多个对象
    private Singleton() {

    }

    // 通过该方法获得实例对象
    public static Singleton getSingleton() {

        return singleton;

    }
}
