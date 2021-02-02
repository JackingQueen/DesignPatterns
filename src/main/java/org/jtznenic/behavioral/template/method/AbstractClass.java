package org.jtznenic.behavioral.template.method;
/**
 * 抽象模板类
 */
public abstract class AbstractClass {
    protected abstract void step1();
    protected abstract void step2();

    /**
     * 钩子方法，是否执行步骤二
     * 可以由子类进行重写
     */
    protected boolean hookMethod() {
        return true;
    }

    /**
     * 模板方法
     */
    public final void abstractMethod() {
        step1();

        if (this.hookMethod()) {
            step2();
        }
    }
}
