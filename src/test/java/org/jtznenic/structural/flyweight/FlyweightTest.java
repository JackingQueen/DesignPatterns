package org.jtznenic.structural.flyweight;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 享元模式测试
 */
public class FlyweightTest {
    @Test
    public void testFlyweight() {
        IFlyweight f1 = FlyweightFactory.getFlyweight("1");
        IFlyweight f2 = FlyweightFactory.getFlyweight("2");
        IFlyweight f3 = FlyweightFactory.getFlyweight("3");
        IFlyweight f4 = FlyweightFactory.getFlyweight("2");

        IFlyweight u1 = new UnsharedFlyweight();
        IFlyweight u2 = new UnsharedFlyweight();
        IFlyweight u3 = new UnsharedFlyweight();

        f1.operation(u1);
        f2.operation(u2);
        f3.operation(u3);
        f4.operation(u2);

        assertThat(f1, notNullValue());
    }
}
