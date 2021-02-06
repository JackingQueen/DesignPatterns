package org.jtznenic.behavioral.mediator;

/**
 * 抽象同事类 角色
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
