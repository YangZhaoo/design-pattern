package main.java.struction.proxy.dynamicproxy;

import main.java.struction.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object param = args[0];
        beforeMethod(param);
        Object res = method.invoke(target, args[0]);
        afterMethod();
        return res;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("Dynamic Proxy beforeMethod");
        if (obj instanceof Order) {
            userId = ((Order) obj).getUserId();
        }
        int routeId = userId % 2;
        System.out.println("动态代理分配到【db" + routeId + "】处理数据");
    }

    private void afterMethod() {
        System.out.println("动态代理之后要执行的方法");
    }
}
