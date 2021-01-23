package org.jtznenic.creational.builder;

/**
 * 具体建造者
 */
public class ConcreateBuilder implements IBuilder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("构建第一部分");
    }

    @Override
    public void buildPart2() {
        product.setPart2("构建第二部分");
    }

    @Override
    public void buildPart3() {
        product.setPart3("构建第三部分");
    }

    @Override
    public Product getResult() {
        return product;
    }

}
