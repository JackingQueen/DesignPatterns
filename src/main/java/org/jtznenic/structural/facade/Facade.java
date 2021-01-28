package org.jtznenic.structural.facade;

/**
 * 外观 或 门面角色
 */
public class Facade {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    public void methodA() {
        a.show();
        b.show();
    }

    public void methodB() {
        a.show();
        c.show();
    }
}
