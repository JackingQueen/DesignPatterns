package org.jtznenic.creational.factory;

/**
 * 具体产品1
 */
public class ConcreateProduct1 implements IProduct {

    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }

}
