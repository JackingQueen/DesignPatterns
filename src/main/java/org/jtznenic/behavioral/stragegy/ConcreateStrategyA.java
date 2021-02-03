package org.jtznenic.behavioral.stragegy;

/**
 * 具体策略类
 */
public class ConcreateStrategyA implements IStrategy {

    @Override
    public void algorithmInterface() {
        System.out.println("策略算法A");
    }

}
