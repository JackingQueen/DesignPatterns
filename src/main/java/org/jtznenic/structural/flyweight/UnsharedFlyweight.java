package org.jtznenic.structural.flyweight;

/**
 * 非享元角色
 */
public class UnsharedFlyweight implements IFlyweight {
    @Override
    public void operation(IFlyweight out) {
        System.out.println("外部状态被调用");
    }

}
