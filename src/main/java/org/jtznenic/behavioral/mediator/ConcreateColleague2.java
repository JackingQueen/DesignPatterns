package org.jtznenic.behavioral.mediator;

/**
 * 具体同事类 角色2
 */
public class ConcreateColleague2 extends AbstractColleague {

    public ConcreateColleague2(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 依赖行为，需要执行其它同事类的方法
     */
    public void doSomething1() {
        System.out.println("具体同事角色1 依赖其它同事");
        super.mediator.doSomething1();
    }

    /**
     * 自发行为，即不与其它同时类交互
     */
    public void doSomething2() {
        System.out.println("具体同事角色2 自发行为");
    }
}
