package org.jtznenic.behavioral.mediator;

import org.junit.Test;

/**
 * 中介者模式测试
 */
public class MediatorTest {
    @Test
    public void testMediator() {
        AbstractMediator mediator = new ConcreateMediator();

        ConcreateColleague1 colleague1 = new ConcreateColleague1(mediator);
        ConcreateColleague2 colleague2 = new ConcreateColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.doSomething2();
        colleague2.doSomething1();
    }
}
