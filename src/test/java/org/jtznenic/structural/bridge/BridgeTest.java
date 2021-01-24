package org.jtznenic.structural.bridge;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 桥接模式 测试
 */
public class BridgeTest {
    @Test
    public void testBridge() {
        Implementor implementorA = new ConcreateImplementorA();
        Implementor implementorB = new ConcreateImplementorB();

        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(implementorA);
        abstraction.operation();

        abstraction.setImplementor(implementorB);
        abstraction.operation();

        assertThat(abstraction, notNullValue());
    }

}
