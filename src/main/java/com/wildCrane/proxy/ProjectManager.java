package com.wildCrane.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProjectManager implements Task{

    @Override
    public void assignWork(String args) {
        System.out.println("assign work to engineer "+args);
    }

}
