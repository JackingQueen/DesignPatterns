package org.jtznenic.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象中介者 角色
 */
public abstract class AbstractMediator {
    @Getter
    @Setter
    protected ConcreateColleague1 colleague1;
    @Getter
    @Setter
    protected ConcreateColleague2 colleague2;

    public abstract void doSomething1();
    public abstract void doSomething2();
}
