package org.jtznenic.behavioral.iterator;

import java.util.List;

/**
 * 具体迭代器
 */
public class ConcreateIterator<T> implements Iterator<T> {

    private List<T> list;
    public int cursor = 0;

    public ConcreateIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {
        return list.get(0);
    }

    @Override
    public T next() {
        this.cursor++;
        if (!this.isDone()) {
            return this.list.get(this.cursor);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return this.cursor >= this.list.size();
    }

    @Override
    public T currentItem() {
        return this.list.get(this.cursor);
    }

}
