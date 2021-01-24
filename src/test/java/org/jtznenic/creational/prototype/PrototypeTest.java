package org.jtznenic.creational.prototype;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 原型模式测试用例
 */
public class PrototypeTest {

    @Test
    public void testPrototype() {
        Prototype p1 = new Prototype();
        assertThat(p1, notNullValue());

        Prototype p2 = p1.clone();
        assertThat(p2, notNullValue());

        assertThat(p1, not(sameInstance(p2)));
    }
}
