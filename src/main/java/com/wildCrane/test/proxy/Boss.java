package com.wildCrane.test.proxy;

public class Boss implements People{

    @Override
    public String work() {
        System.out.println("boss work");
        return "boss is busy";
    }
}
