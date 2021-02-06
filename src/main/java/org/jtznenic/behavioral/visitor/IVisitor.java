package org.jtznenic.behavioral.visitor;

/**
 * 抽象访问者 角色
 */
public interface IVisitor {
    void visit(ConcreateElementA element);
    void visit(ConcreateElementB element);
}
