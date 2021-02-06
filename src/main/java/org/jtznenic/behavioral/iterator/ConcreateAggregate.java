package org.jtznenic.behavioral.iterator;

import java.util.List;
import com.google.common.collect.Lists;

/**
 * 具体聚合 角色
 */
public class ConcreateAggregate<T> implements IAggregate<T> {

    private List<T> list = Lists.newArrayList();

    @Override
    public void add(T element) {
        this.list.add(element);
    }

    @Override
    public void remove(T element) {
        this.list.remove(element);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreateIterator(this.list);
    }

}
