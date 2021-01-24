package org.jtznenic.structural.proxy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 代理模式 测试
 */
public class ProxyTest {
    @Test
    public void testRequest() {
        Proxy proxy = new Proxy(new RealSubject());
        ISubject subject = proxy;
        IProxy iProxy = proxy;

        assertThat(subject, notNullValue());
        assertThat(iProxy.count(), equalTo(0));

        subject.request();
        assertThat(iProxy.count(), equalTo(1));
    }
}
