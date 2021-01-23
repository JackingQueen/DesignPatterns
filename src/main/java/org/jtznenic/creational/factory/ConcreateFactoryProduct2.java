package org.jtznenic.creational.factory;

/**
 * 生产各族的 等级2的产品
 */
public class ConcreateFactoryProduct2 implements IAbstractFactory {

    @Override
    public IProductA createProductA() {
        return new ConcreateProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreateProductB2();
    }

}
