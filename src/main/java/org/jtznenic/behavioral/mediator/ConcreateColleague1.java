package org.jtznenic.behavioral.mediator;

/**
 * 具体同事类 角色1
 */
public class ConcreateColleague1 extends AbstractColleague {

    public ConcreateColleague1(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 自发行为，即不与其它同事类交互
     */
    public void doSomething1() {
        System.out.println("具体同事角色1 自发行为");
    }

    /**
     * 依赖行为，需要执行其它同事类的方法
     */
    public void doSomething2() {
        System.out.println("具体同事角色1 依赖其它同事");
        super.mediator.doSomething1();
    }
}
