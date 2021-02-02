package org.jtznenic.behavioral.template.method;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 模板方法模式测试
 */
public class TemplateMethodTest {

    @Test
    public void testTemplateMethod() {
        AbstractClass abs = new ConcreateClass();
        abs.abstractMethod();

        assertThat(abs, notNullValue());
    }

}
