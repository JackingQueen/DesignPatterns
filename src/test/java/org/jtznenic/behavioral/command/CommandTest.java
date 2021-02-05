package org.jtznenic.behavioral.command;

import org.junit.Test;

/**
 * 命令模式 测试
 */
public class CommandTest {

    @Test
    public void testCommand() {
        // 其实可以把 receiver 放到命令子类中进行初始化，因为改命令知道自己需要那些模块的内容。
        Receiver receiver = new Receiver();
        AbstractCommand command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }

}
