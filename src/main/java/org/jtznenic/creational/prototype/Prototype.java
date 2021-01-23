package org.jtznenic.creational.prototype;

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
