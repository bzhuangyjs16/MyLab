package com.wildCrane.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler{
    private Engineer engineer;

    public MyInvocationHandler(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        method.invoke(engineer,args);
        System.out.println("after");
        return proxy;
    }

    public Task getProjectManager(){
        Task projectManager = (Task) Proxy.newProxyInstance(Task.class.getClassLoader(), new Class<?>[] { Task.class },this);
        return projectManager;
    }
}
