package org.jtznenic.behavioral.visitor;

/**
 * 具体元素 角色B
 */
public class ConcreateElementB extends IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operatorB() {
        return "具体元素 角色B";
    }
}
