package org.jtznenic.behavioral.iterator;

/**
 * 抽象迭代器 角色
 */
public interface Iterator<T> {
    T first();

    T next();

    boolean isDone();

    T currentItem();
}
