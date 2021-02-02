package org.jtznenic.structural.composite;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 * 组合模式测试
 */
public class CompositeTest {

    private IComponent component;

    @Before
    public void setUp() {
        IComponent headquarters = new Composite("总部");

        IComponent aBranch = new Composite("a分部");
        IComponent bBranch = new Composite("b分部");
        IComponent cBranch = new Composite("c分部");
        headquarters.save(aBranch);
        headquarters.save(bBranch);
        headquarters.save(cBranch);

        IComponent a1Employee = new Leaf("a1 雇员");
        IComponent a2Employee = new Leaf("a2 雇员");
        IComponent a3Employee = new Leaf("a3 雇员");
        aBranch.save(a1Employee);
        aBranch.save(a2Employee);
        aBranch.save(a3Employee);

        IComponent b1Employee = new Leaf("b1 雇员");
        IComponent b2Employee = new Leaf("b2 雇员");
        bBranch.save(b1Employee);
        bBranch.save(b2Employee);

        IComponent c1Employee = new Leaf("b3 雇员");
        cBranch.save(c1Employee);

        this.component = headquarters;
    }

    @Test
    public void testComposite() {
        assertThat(this.component, notNullValue());

        this.show();

        System.out.println("***a2 雇员离职***");
        this.component.listChildren().get(0).remove(new Leaf("a2 雇员"));
        this.show();

        System.out.println("撤销 c分部");
        this.component.remove(new Composite("c分部"));
        this.show();
    }

    private void show() {
        System.out.println("***所有部门员工展示***");
        this.component.show();
    }
}
