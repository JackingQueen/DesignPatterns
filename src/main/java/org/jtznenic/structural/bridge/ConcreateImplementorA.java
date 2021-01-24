package org.jtznenic.structural.bridge;

/**
 * 具体实现化角色
 */
public class ConcreateImplementorA implements Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A");
    }

}
