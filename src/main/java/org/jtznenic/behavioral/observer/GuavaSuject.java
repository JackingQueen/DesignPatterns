package org.jtznenic.behavioral.observer;

import com.google.common.eventbus.EventBus;

/**
 * guava 抽象主题角色
 */
public abstract class GuavaSuject {
    private EventBus eventBus = new EventBus();

    public void addRegister(Object register) {
        this.eventBus.register(register);
    }

    public void removeRegister(Object register) {
        this.eventBus.unregister(register);
    }

    public void post(Object event) {
        this.eventBus.post(event);
    }
}
