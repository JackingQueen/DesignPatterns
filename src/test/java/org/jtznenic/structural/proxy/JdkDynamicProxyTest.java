package org.jtznenic.structural.proxy;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class JdkDynamicProxyTest {
    @Test
    public void testProxy() {
        JdkDynamicProxy proxy = new JdkDynamicProxy(new RealSubject());
        ISubject subject = proxy.getPorxy();
        subject.request();

        assertThat(subject, notNullValue());
    }

}
