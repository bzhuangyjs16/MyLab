package com.wildCrane.jvm;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class JavaMethodAreaOOM {
    public static void main(String[] args) {

            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            System.out.println("hello");
            OOMObject oomObject = new OOMObject();
            oomObject.method();
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    System.out.println("before");
                    methodProxy.invokeSuper(o,objects);
                    System.out.println("after");
                    return methodProxy;
                }
            });
        OOMObject o = (OOMObject)enhancer.create();
        o.method();
        }

    static class OOMObject{
        public void method(){
            System.out.println("OOMObject");
        }
    }
}
