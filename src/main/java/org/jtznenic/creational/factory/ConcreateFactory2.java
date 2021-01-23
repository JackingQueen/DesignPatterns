package org.jtznenic.creational.factory;

/**
 * 具体工厂，只生产具体产品2
 */
public class ConcreateFactory2 implements IFactory{

    @Override
    public IProduct createPrduct() {
        return new ConcreateProduct2();
    }

}
