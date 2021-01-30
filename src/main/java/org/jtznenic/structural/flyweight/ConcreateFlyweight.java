package org.jtznenic.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 具体享元角色
 */
@AllArgsConstructor
@NoArgsConstructor
public class ConcreateFlyweight implements IFlyweight  {
    private String intrinsic;

    @Override
    public void operation(IFlyweight out) {
        System.out.println("具体享元角色被调用");
        out.operation(out);
    }
}
