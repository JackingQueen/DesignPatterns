package org.jtznenic.creational.factory;

/**
 * 生产各族的 等级1的产品
 */
public class ConcreateFactoryProduct1 implements IAbstractFactory {

    @Override
    public IProductA createProductA() {
        return new ConcreateProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreateProductB1();
    }

}
