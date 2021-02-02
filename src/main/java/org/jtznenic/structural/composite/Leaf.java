package org.jtznenic.structural.composite;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 树叶构件
 */
public class Leaf implements IComponent {

    private String name;

    /**
     * @param name
     */
    public Leaf(String name) {
        this.name = name;
    }


    @Override
    public List<IComponent> listChildren() {
        return Collections.emptyList();
    }

    @Override
    public void save(IComponent component) {
        System.out.printf("%s 不支持增加 /n", name);
    }

    @Override
    public void remove(IComponent component) {
        System.out.printf("%s 不支持删除 /n", name);
    }

    @Override
    public void show() {
        System.out.println(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Leaf)) {
            return false;
        }
        Leaf other = (Leaf) obj;
        return Objects.equals(name, other.name);
    }
}
