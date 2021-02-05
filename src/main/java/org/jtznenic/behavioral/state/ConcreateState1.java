package org.jtznenic.behavioral.state;

/**
 * 具体状态 角色1 只负责处理方法1
 */
public class ConcreateState1 extends State {

    @Override
    public void handle1() {
        System.out.println("具体状态角色1 处理");
    }

    @Override
    public void handle2() {
        super.context.setState(Context.STATE2);
        super.context.handle2();
    }

}
