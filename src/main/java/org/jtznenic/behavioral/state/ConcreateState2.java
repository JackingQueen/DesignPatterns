package org.jtznenic.behavioral.state;

/**
 * 具体状态 角色2 只负责处理方法2
 */
public class ConcreateState2 extends State {

    @Override
    public void handle1() {
        super.context.setState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("具体状态角色2 处理");
    }

}
