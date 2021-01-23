package org.jtznenic.creational.singleton;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 单例模式测试用例
 */
public class SingletonTest {

    @Test
    public void testGetSingleton() {
        Singleton singleton = Singleton.getSingleton();
        assertThat(singleton, notNullValue());
    }
}
