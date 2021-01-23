package org.jtznenic.creational.factory;

/**
 * 产品枚举类
 */
public enum ProductEnum {
    PRODUCT1("org.jtznenic.creational.factory.ConcreateProduct1"),
    PRODUCT2("org.jtznenic.creational.factory.ConcreateProduct2");

    private String className;
    /**
     * @param className
     */
    private ProductEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

}
