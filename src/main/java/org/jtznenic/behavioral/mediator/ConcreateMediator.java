package org.jtznenic.behavioral.mediator;

/**
 * 具体中介者 角色
 */
public class ConcreateMediator extends AbstractMediator {

    @Override
    public void doSomething1() {
        super.colleague1.doSomething1();
    }

    @Override
    public void doSomething2() {
        super.colleague2.doSomething2();
    }
}
