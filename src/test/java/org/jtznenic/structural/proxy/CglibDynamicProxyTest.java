package org.jtznenic.structural.proxy;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CglibDynamicProxyTest {
    @Test
    public void testPorxy() {
        CglibDynamicProxy proxy = new CglibDynamicProxy(RealSubject.class);
        ISubject subject = proxy.getProxy();
        subject.request();

        assertThat(subject, notNullValue());
    }

}
