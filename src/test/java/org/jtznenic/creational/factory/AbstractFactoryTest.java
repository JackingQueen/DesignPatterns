package org.jtznenic.creational.factory;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 抽象工厂模式 测试
 */
public class AbstractFactoryTest {

    @Test
    public void testCreateProduct() {
        IAbstractFactory factory1 = new ConcreateFactoryProduct1();
        IAbstractFactory factory2 = new ConcreateFactoryProduct2();

        IProductA productA1 = factory1.createProductA();
        IProductB productB1 = factory1.createProductB();
        IProductA productA2 = factory2.createProductA();
        IProductB productB2 = factory2.createProductB();

        assertThat(productA1, notNullValue());
        productA1.show();

        assertThat(productA2, notNullValue());
        productA2.show();

        assertThat(productB1, notNullValue());
        productB1.show();

        assertThat(productB2, notNullValue());
        productB2.show();
    }
}
