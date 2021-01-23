package org.jtznenic.creational.prototype;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.same;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void testPrototype() {
        Prototype p1 = new Prototype();
        assertThat(p1, notNullValue());

        Prototype p2 = p1.clone();
        assertThat(p2, notNullValue());

        assertThat(p1, not(same(p2)));
    }
}
