package org.jtznenic.creational.builder;

/**
 * 导演类或者建造指挥者
 */
public class Director {
    public Product construct(IBuilder builder) {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return builder.getResult();
    }
}
