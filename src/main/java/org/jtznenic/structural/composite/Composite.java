package org.jtznenic.structural.composite;

import java.util.List;
import java.util.Objects;
import com.google.common.collect.Lists;

/**
 * 树枝构件
 */
public class Composite implements IComponent {

    private List<IComponent> children = Lists.newArrayList();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public List<IComponent> listChildren() {
        return this.children;
    }

    @Override
    public void save(IComponent component) {
        children.add(component);
    }

    @Override
    public void remove(IComponent component) {
        this.children.remove(component);
    }

    @Override
    public void show() {
        System.out.println(name);
        children.forEach(e -> e.show());
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
        if (!(obj instanceof Composite)) {
            return false;
        }
        Composite other = (Composite) obj;
        return Objects.equals(name, other.name);
    }
}
