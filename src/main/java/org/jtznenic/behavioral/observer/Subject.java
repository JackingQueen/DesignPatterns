package org.jtznenic.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题 角色
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        this.observers.forEach(Observer::update);
    }
}
