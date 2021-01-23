package org.jtznenic.creational.factory;

/**
 * A族 等级2 产品
 */
public class ConcreateProductA2 implements IProductA{

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }

}
