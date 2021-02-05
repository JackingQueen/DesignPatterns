package org.jtznenic.behavioral.command;

import org.junit.Test;

/**
 * 命令模式 测试
 */
public class CommandTest {

    @Test
    public void testCommand() {
        AbstractCommand command = new ConcreteCommand();

        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }

}
