package org.jtznenic.behavioral.state;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 状态模式测试
 */
public class StateTest {
    @Test
    public void testState() {
        Context context = new Context();
        context.setState(Context.STATE1);

        context.handle1();
        context.handle2();

        assertThat(context, notNullValue());
    }

}
