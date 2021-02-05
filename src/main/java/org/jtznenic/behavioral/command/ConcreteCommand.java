package org.jtznenic.behavioral.command;

/**
 * 具体的命令执执行者
 * 可以看做时 对不同模块下 提供的功能进行组合调用，以实现要提供的命令服务
 */
public class ConcreteCommand extends AbstractCommand {
    public ConcreteCommand() {
        super(new Receiver());
    }

    @Override
    public void execute() {
       this.receiver.action();
    }

}
