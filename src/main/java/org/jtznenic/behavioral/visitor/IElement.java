package org.jtznenic.behavioral.visitor;

/**
 * 抽象元素 角色
 */
public abstract class IElement {
 public abstract void accept(IVisitor visitor);
}
