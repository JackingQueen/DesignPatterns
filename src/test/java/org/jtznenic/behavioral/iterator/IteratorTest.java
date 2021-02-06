package org.jtznenic.behavioral.iterator;

import org.junit.Test;

/**
 * 迭代器模式测试
 */
public class IteratorTest {
    @Test
    public void testIterator() {
        IAggregate<String> aggregate = new ConcreateAggregate<>();

        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");


        Iterator<String> iterator = aggregate.getIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
