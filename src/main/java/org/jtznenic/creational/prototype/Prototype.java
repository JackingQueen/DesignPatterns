package org.jtznenic.creational.prototype;

/**
 * 通过原型模式代码
 */
public class Prototype implements Cloneable {

    @Override
    public Prototype clone()  {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone failed");
        }
        return prototype;
    }
}
