package org.jtznenic.creational.factory;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 工厂方法模式 测试
 */
public class FactoryMethodTest {

    @Test
    public void testFacotry() {
        IFactory factory = new ConcreateFactory1();
        IProduct product1 = factory.createPrduct();
        assertThat(product1, notNullValue());
        product1.show();

        factory = new ConcreateFactory2();
        IProduct product2 = factory.createPrduct();
        assertThat(product2, notNullValue());
        product2.show();
    }
}
