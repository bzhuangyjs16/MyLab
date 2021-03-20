package com.wildCrane.proxy;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        MyInvocationHandler proxyBuilder = new MyInvocationHandler(engineer);
        Task proxy =proxyBuilder.getProjectManager();
        proxy.assignWork("hello work");
        System.out.println(proxy);
    }
}
