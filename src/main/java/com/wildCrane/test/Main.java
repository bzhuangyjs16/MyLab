package com.wildCrane.test;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
    /*    People boss = new Boss();
        InvocationHandler assistant = new Assistant(boss);
        People proxy = (People) Proxy.newProxyInstance(boss.getClass().getClassLoader(),People.class.getInterfaces(),assistant);
        proxy.work();*/
        System.out.println("hello world");

    }
}
