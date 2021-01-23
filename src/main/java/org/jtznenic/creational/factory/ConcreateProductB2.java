package org.jtznenic.creational.factory;

/**
 * B族 等级2 产品
 */
public class ConcreateProductB2 implements IProductB{

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }

}
