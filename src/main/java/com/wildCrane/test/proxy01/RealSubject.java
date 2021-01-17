package com.wildCrane.test.proxy01;

public class RealSubject implements Subject{

    public void request(){
        System.out.println("From real subject.");
    }
}
