package org.jtznenic.creational.factory;

/**
 * A族 等级1 产品
 */
public class ConcreateProductA1 implements IProductA{

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }

}
