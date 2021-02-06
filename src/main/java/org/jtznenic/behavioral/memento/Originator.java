package org.jtznenic.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发起人 角色
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
