package org.jtznenic.behavioral.observer;

/**
 * jdk 具体主题角色
 */
public class JdkConcreateSubject extends JdkSubject {
    public void doSomething() {
        super.firePropertyChange(this.getClass().getName(), "old", "new");
    }
}
