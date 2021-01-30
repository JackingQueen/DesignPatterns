package org.jtznenic.structural.flyweight;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂角色
 */
public class FlyweightFactory {
    private static final Map<String, IFlyweight> pool = new ConcurrentHashMap<>();

    public static final IFlyweight getFlyweight(String intrinsic) {
        IFlyweight flyweight = pool.get(intrinsic);

        if (Objects.nonNull(flyweight)) {
            System.out.println(intrinsic + "复用");
        } else {
            flyweight = new ConcreateFlyweight(intrinsic);
            pool.put(intrinsic, flyweight);
        }

        return flyweight;
    }
}
