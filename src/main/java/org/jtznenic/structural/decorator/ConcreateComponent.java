package org.jtznenic.structural.decorator;

/**
 * 具体构建角色
 */
public class ConcreateComponent implements IComponent {

    @Override
    public void operation() {
        System.out.println("核心逻辑");
    }

}
