package org.jtznenic.behavioral.visitor;

/**
 * 具体访问者B
 */
public class ConcreateVisitorB implements IVisitor{

    @Override
    public void visit(ConcreateElementA element) {
        System.out.println("具体访问者B 访问了" + element.operatorA());

    }

    @Override
    public void visit(ConcreateElementB element) {
        System.out.println("具体访问者B 访问了" + element.operatorB());
    }

}
