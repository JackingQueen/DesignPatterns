package org.jtznenic.behavioral.command;

/**
 * 实现者/接收者 角色
 * 可以理解为系统不同模块所提供的功能，可能比命令定义的要多
 */
public class Receiver {
    public void action() {
        System.out.println("具体接收者，执行任务。");
    }
}
