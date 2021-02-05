package org.jtznenic.behavioral.responsibility.chain;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 * 责任链模式测试
 */
public class ChainOfResponsibilityTest {

    private Handler handler;

    @Before
    public void setUp() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNext(handler2);

        handler = handler1;
    }

    @Test
    public void testChainOfResponsibility() {
        Response response3 = this.handler.handleRequest(new Request(3));
        assertThat(response3.getMsg(), equalTo("无对应处理角色"));

        Response response2 = this.handler.handleRequest(new Request(2));
        assertThat(response2.getMsg(), equalTo("具体处理者角色2"));

        Response response1 = this.handler.handleRequest(new Request(1));
        assertThat(response1.getMsg(), equalTo("具体处理者角色1"));
    }
}
