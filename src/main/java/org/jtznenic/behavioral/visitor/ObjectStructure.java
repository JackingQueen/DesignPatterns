package org.jtznenic.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构 角色
 */
public class ObjectStructure {
    private List<IElement> elements = new ArrayList<>();

    public void add(IElement element) {
        this.elements.add(element);
    }

    public void remove(IElement element) {
        this.elements.remove(element);
    }

    public void accpet(IVisitor visitor) {
        elements.forEach(e -> e.accept(visitor));
    }
}
