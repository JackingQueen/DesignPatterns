package org.jtznenic.behavioral.command;

/**
 * 抽象命令 角色
 * 可以理解为 我们要向客户端提供的 标准化功能，其实是对模块下不同功能的组合来 提供不同形式的命令
 */
public abstract class AbstractCommand {
    protected Receiver receiver;
    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
