package org.jtznenic.creational.factory;

import java.lang.reflect.Constructor;

/**
 * 通用简单工厂模式代码
 */
public class SimpleFactory {

    private SimpleFactory() {}

    public static final String PRODUCT1 = "1";
    public static final String PRODUCT2 = "2";

    /**
     * 产品生产方法
     *
     * @param kind 产品类别
     * @return 具体的产品对象
     */
    public static IProduct makeProduct(ProductEnum product) {
        try {
            Class clazz = Class.forName(product.getClassName());
            Constructor<IProduct> constructor = clazz.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
