package org.jtznenic.creational.factory;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 简单工厂模式测试用例
 */
public class SimpleFactoryTest {

    @Test
    public void testFacotry() {
        IProduct product1 = SimpleFactory.makeProduct(ProductEnum.PRODUCT1);
        assertThat(product1, notNullValue());
        product1.show();

        IProduct product2 = SimpleFactory.makeProduct(ProductEnum.PRODUCT2);
        assertThat(product2, notNullValue());
        product2.show();
    }

}
