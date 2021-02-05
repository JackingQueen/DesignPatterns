package org.jtznenic.behavioral.observer;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 观察者模式 测试
 */
public class ObserverTest {
    @Test
    public void testObserver() {
        ConcreateSubject subject = new ConcreateSubject();
        subject.attach(new ConcreateObserver());

        subject.doSomething();

        assertThat(subject, notNullValue());
    }
}
