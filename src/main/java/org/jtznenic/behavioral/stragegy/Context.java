package org.jtznenic.behavioral.stragegy;

import lombok.Getter;
import lombok.Setter;

/**
 * context 上下文
 */
public class Context {
    @Getter
    @Setter
    private IStrategy strategy;

    public void strategyMethod() {
        this.strategy.algorithmInterface();
    }
}
