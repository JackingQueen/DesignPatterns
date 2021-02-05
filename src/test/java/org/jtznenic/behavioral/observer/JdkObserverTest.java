package org.jtznenic.behavioral.observer;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * jdk 观察者模式 测试
 */
public class JdkObserverTest {
    @Test
    public void testJdkObserver() {
        JdkConcreateSubject subject = new JdkConcreateSubject();
        subject.addPropertyChangeListener(new JdkConcreateObserver());
        subject.doSomething();

        assertThat(subject, notNullValue());
    }
}
