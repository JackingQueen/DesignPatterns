package org.jtznenic.structural.decorator;

import lombok.Setter;

/**
 * 抽象装饰角色
 */
public abstract class IDecorator implements IComponent {
    @Setter
    private IComponent component;

    public void operation() {
        component.operation();
    }

}
