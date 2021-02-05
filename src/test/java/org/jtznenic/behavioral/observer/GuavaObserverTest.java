package org.jtznenic.behavioral.observer;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;
/**
 * guava 观察者模式 测试
 */
public class GuavaObserverTest {
    @Test
    public void testGuavaObserver() {
        GuavaConcreateSubject subject = new GuavaConcreateSubject();
        subject.addRegister(new GuavaConcreateObserver());
        subject.doSomething();

        assertThat(subject, notNullValue());
    }
}
