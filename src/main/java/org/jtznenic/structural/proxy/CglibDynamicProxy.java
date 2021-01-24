package org.jtznenic.structural.proxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib 动态代理
 */
public class CglibDynamicProxy implements MethodInterceptor {
    private Class clazz;

    public CglibDynamicProxy(Class clazz) {
        this.clazz = clazz;
    }

    public ISubject getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (ISubject) enhancer.create();
    }

    /**
     * @param obj cglib 生成的代理对象
     * @param method 被代理对象方法
     * @param args 被代理对象方法的参数
     * @param proxy 代理方法
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
            throws Throwable {
        this.before();
        proxy.invokeSuper(obj, args);
        this.after();

        return null;
    }

    private void before() {
        System.out.println("cglib动态代理前置增强");
    }

    private void after() {
        System.out.println("cglib动态代理后置增强");
    }
}
