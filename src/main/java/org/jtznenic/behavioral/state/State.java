package org.jtznenic.behavioral.state;

import lombok.Setter;

/**
 * 抽象状态 角色
 */
public abstract class State {
    @Setter
    protected Context context;

    public abstract void handle1();

    public abstract void handle2();

}
