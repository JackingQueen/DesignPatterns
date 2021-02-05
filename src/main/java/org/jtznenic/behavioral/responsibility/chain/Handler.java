package org.jtznenic.behavioral.responsibility.chain;

import java.util.Objects;
import lombok.Setter;

/**
 * 抽象处理者 角色
 */
public abstract class Handler {
    @Setter
    private Handler next;
    /**
     * 该节点可处理的级别
     */
    protected abstract boolean canHandle(Request request);
    /**
     * 该节点的具体处理行为
     */
    protected abstract Response echo(Request request);

    /**
     * 使用了面板方法模式，控制节请求对象的流动
     */
    public final Response handleRequest(Request request) {
        if (this.canHandle(request)) {
            return this.echo(request);
        }

        if (Objects.nonNull(this.next)) {
            return this.next.handleRequest(request);
        }

        // 无人处理逻辑
        return new Response("无对应处理角色");
    }
}
