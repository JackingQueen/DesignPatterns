package org.jtznenic.behavioral.responsibility.chain;

import com.google.common.base.Objects;

/**
 * 具体处理者角色2
 */
public class ConcreteHandler2 extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return Objects.equal(2, request.getLevel());
    }

    @Override
    protected Response echo(Request request) {
        return new Response("具体处理者角色2");
    }

}
