package com.annotation;

public class Person {

    @Deprecated
    @MyAnnotation
    public void empty(){
        System.out.println("\nempty");
    }

    @MyAnnotation(value = {"girl","boy"})
    public void somebody(String name, int age){
        System.out.println("\nsomebody: "+name+", "+age);
    }
}
