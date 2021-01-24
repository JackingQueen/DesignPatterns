package org.jtznenic.structural.adapter;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 适配器模式 测试
 */
public class AdapterTest {
    @Test
    public void testAdapter() {
        Adaptee source = new Adaptee();
        ITarget target = new Adapter(source);
        target.request();

        assertThat(target, notNullValue());
    }
}
