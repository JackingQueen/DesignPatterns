package org.jtznenic.creational.factory;

/**
 * 抽象工厂接口
 */
public interface IAbstractFactory {
    /**
     * 生产A族产品
     */
    IProductA createProductA();
    /**
     * 生产B族产品
     */
    IProductB createProductB();
}
