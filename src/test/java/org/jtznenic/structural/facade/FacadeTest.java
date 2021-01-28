package org.jtznenic.structural.facade;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class FacadeTest {
    /**
     * 外观或门面模式测试
     */
    @Test
    public void testFacade() {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();

        assertThat(facade, notNullValue());
    }
}
