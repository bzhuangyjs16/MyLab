package com.wildCrane.proxy;

public class Engineer implements Task{
    @Override
    public void assignWork(String args) {
        System.out.println("work hard: "+args);
    }
}
