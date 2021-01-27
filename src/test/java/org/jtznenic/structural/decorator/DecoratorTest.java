package org.jtznenic.structural.decorator;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 装饰模式 测试
 */
public class DecoratorTest {

    @Test
    public void decoratorTest() {
        IComponent component = new ConcreateComponent();
        IDecorator decorator = new ConcreateDecorator();

        decorator.setComponent(component);
        decorator.operation();

        assertThat(decorator, notNullValue());
    }

}
