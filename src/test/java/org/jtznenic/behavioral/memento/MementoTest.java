package org.jtznenic.behavioral.memento;

import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 备忘录模式 测试
 */
public class MementoTest {
    @Test
    public void testMemento() {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator("off");
        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);

        System.out.println(originator);

        originator.setState("on");
        System.out.println(originator);

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator);
    }
}
