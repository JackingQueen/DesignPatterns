package org.jtznenic.structural.bridge;

import lombok.Setter;

/**
 * 抽象化角色
 */
public abstract class Abstraction {
    @Setter
    protected Implementor implementor;

    public abstract void operation();

}
