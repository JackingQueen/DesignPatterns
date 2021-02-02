package org.jtznenic.behavioral.template.method;

/**
 * 具体方法
 */
public class ConcreateClass extends AbstractClass {

    @Override
    protected void step1() {
        System.out.println("具体步骤一");
    }

    @Override
    protected void step2() {
        System.out.println("具体步骤二");
    }

}
