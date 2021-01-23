package org.jtznenic.creational.factory;

/**
 * B族 等级1 产品
 */
public class ConcreateProductB1 implements IProductB{

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }

}
