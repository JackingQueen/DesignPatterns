package org.jtznenic.structural.composite;

import java.util.List;

/**
 * 抽象构建角色
 */
public interface IComponent {
    void save(IComponent component);

    void remove(IComponent component);

    void show();

    List<IComponent> listChildren();
}
