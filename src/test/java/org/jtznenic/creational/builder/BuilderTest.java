package org.jtznenic.creational.builder;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 建造者模式 测试
 */
public class BuilderTest {

    @Test
    public void testBuilder() {
        IBuilder builder = new ConcreateBuilder();
        Director director = new Director();
        Product product = director.construct(builder);

        assertThat(product, notNullValue());
        product.show();
    }
}
