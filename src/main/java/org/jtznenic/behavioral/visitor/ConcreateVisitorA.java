package org.jtznenic.behavioral.visitor;

/**
 * 具体访问者A
 */
public class ConcreateVisitorA implements IVisitor{

    @Override
    public void visit(ConcreateElementA element) {
        System.out.println("具体访问者A 访问了" + element.operatorA());

    }

    @Override
    public void visit(ConcreateElementB element) {
        System.out.println("具体访问者A 访问了" + element.operatorB());
    }

}
