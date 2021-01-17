package com.wildCrane.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Person person = new Person();
        Class<Person> c = Person.class;
        Method mSomebody = c.getMethod("somebody", String.class,int.class);
        mSomebody.invoke(person,new Object[]{"lily",10});
        Method mEmpty = c.getMethod("empty");
        iteratorAnnotations(mEmpty);
    }

    public static void iteratorAnnotations(Method method){
        if(method.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            String[] values = myAnnotation.value();
            for(String s:values){
                System.out.println(s+",");
            }
            System.out.println();
        }
        Annotation[] annotations = method.getAnnotations();
        for(Annotation annotation:annotations){
            System.out.println("a:"+annotation);
        }

    }
}
