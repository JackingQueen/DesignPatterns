package org.jtznenic.creational.factory;

/**
 * 具体工厂，只生成 具体产品1
 */
public class ConcreateFactory1 implements IFactory {

    @Override
    public IProduct createPrduct() {
        return new ConcreateProduct1();
    }

}
