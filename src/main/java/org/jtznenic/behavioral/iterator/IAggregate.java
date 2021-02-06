package org.jtznenic.behavioral.iterator;

/**
 * 抽象聚合 角色
 */
public interface IAggregate<T> {
    void add(T element);
    void remove(T element);

    Iterator<T> getIterator();
}
