package org.jtznenic.structural.bridge;

/**
 * 扩展抽象化角色
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }

}
