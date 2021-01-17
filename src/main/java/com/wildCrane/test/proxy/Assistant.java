package com.wildCrane.test.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Assistant implements InvocationHandler {
    private Object realObject;

    public Assistant(Object realObject){
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        Object invoke = method.invoke(realObject,args);
        System.out.println("after invoke");
        return null;
    }
}
