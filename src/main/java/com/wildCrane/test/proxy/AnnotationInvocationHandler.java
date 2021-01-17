package com.wildCrane.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnnotationInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
