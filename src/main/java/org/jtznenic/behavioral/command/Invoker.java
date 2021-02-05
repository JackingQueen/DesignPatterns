package org.jtznenic.behavioral.command;

import lombok.Setter;

/**
 * 调用者/请求者 角色
 * 可以看作对执行的封装，方便客户端对命令进行统一的调用
 */
public class Invoker {
    @Setter
    private AbstractCommand command;

    public void executeCommand() {
        this.command.execute();
    }
}
