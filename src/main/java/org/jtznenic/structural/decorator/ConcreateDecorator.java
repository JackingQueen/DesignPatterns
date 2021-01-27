package org.jtznenic.structural.decorator;

/**
 * 具体装饰角色
 */
public class ConcreateDecorator extends IDecorator {
    private void decortorMethod() {
        System.out.println("修饰逻辑");
    }

    @Override
    public void operation() {
        this.decortorMethod();
        super.operation();
    }
}
