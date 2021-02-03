package org.jtznenic.behavioral.strategy;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import org.jtznenic.behavioral.stragegy.ConcreateStrategyA;
import org.jtznenic.behavioral.stragegy.ConcreateStrategyB;
import org.jtznenic.behavioral.stragegy.Context;
import org.jtznenic.behavioral.stragegy.IStrategy;
import org.junit.Test;

/**
 * 策略模式测试
 */
public class StrategyTest {

    @Test
    public void testStrategy() {
        IStrategy strategy = new ConcreateStrategyA();

        Context context = new Context();
        context.setStrategy(strategy);
        context.strategyMethod();


        strategy = new ConcreateStrategyB();
        context.setStrategy(strategy);
        context.strategyMethod();

        assertThat(context, notNullValue());
    }

}
