package org.jtznenic.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 备忘录 角色
 */
@Data
@AllArgsConstructor
public class Memento {
    private String state;
}
