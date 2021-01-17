package com.wildCrane.annotation;

public class Person {

    @Deprecated
    @MyAnnotation
    public void empty(){
        System.out.println("empty");
    }

    @MyAnnotation(value = {"girl","boy"})
    public void somebody(String name, int age){
        System.out.println("\nsomebody: "+name+", "+age);
    }
}
