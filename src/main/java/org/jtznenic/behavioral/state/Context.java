package org.jtznenic.behavioral.state;

import lombok.Getter;
import lombok.Setter;

/**
 * 环境类 角色
 */
public class Context {
    public static final State STATE1 = new ConcreateState1();
    public static final State STATE2 = new ConcreateState2();

    @Getter
    private State state;
    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void handle1() {
        this.state.handle1();
    }

    public void handle2() {
        this.state.handle2();
    }

}
