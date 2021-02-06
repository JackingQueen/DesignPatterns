package org.jtznenic.behavioral.visitor;

/**
 * 具体元素 角色A
 */
public class ConcreateElementA extends IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operatorA() {
        return "具体元素 角色A";
    }
}
