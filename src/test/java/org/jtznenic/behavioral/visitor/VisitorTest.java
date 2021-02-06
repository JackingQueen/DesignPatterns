package org.jtznenic.behavioral.visitor;

import org.junit.Test;

/**
 * 访问者模式 测试
 */
public class VisitorTest {
    @Test
    public void testVisitor() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreateElementA());
        objectStructure.add(new ConcreateElementB());

        objectStructure.accpet(new ConcreateVisitorA());
        objectStructure.accpet(new ConcreateVisitorB());
    }
}
