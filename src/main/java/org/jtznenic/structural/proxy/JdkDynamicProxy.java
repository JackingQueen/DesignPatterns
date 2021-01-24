package org.jtznenic.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理方法
 */
public class JdkDynamicProxy implements InvocationHandler {

    /**
     * 被代理的真实对象
     */
    private Object subject;

    public JdkDynamicProxy(Object subject) {
        this.subject = subject;
    }

    public ISubject getPorxy() {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class[] interfaces = subject.getClass().getInterfaces();

        return (ISubject) Proxy.newProxyInstance(loader, interfaces, this);
    }


    /**
     * 调用被代理的方法
     * @param proxy 代理类
     * @param method 被代理的方法
     * @param args 该方法的参数数组
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        method.invoke(this.subject, args);
        this.after();
        return null;
    }

    private void before() {
        System.out.println("jdk动态代理前置增强");
    }

    private void after() {
        System.out.println("jdk动态代理后置增强");
    }


}
