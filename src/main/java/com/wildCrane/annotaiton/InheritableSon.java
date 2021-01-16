package com.wildCrane.annotaiton;


public class InheritableSon extends InheritableFather {
    public InheritableSon(){
        super();
        System.out.println("InheritableSon:"+InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }
    public static void main(String[] args)
    {
        InheritableSon is = new InheritableSon();
    }
}
