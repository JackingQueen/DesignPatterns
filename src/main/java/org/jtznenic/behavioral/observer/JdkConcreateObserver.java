package org.jtznenic.behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * jdk 具体观察者角色
 */
public class JdkConcreateObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("收到消息");
        System.out.println(evt.getPropagationId());
        System.out.println(evt.getPropertyName());
        System.out.println(evt.getOldValue());
        System.out.println(evt.getNewValue());
    }


}
