package org.jtznenic.creational.builder;

/**
 * 抽象建造者
 */
public interface IBuilder {
    /**
     * 构建所需步骤
     */
    void buildPart1();
    void buildPart2();
    void buildPart3();

    /**
     * 获取构建结果
     */
    Product getResult();
}
