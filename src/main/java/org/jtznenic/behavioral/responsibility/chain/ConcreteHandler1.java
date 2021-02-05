package org.jtznenic.behavioral.responsibility.chain;

import com.google.common.base.Objects;

/**
 * 具体处理者角色1
 */
public class ConcreteHandler1 extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return Objects.equal(1, request.getLevel());
    }

    @Override
    protected Response echo(Request request) {
        return new Response("具体处理者角色1");
    }

}
