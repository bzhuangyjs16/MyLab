package com.wildCrane.jvm;

public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024*1024;

    private byte[] bigSize = new byte[2* _1MB];

    public static void testGC(){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

    public static void main(String[] args) {
        //ReferenceCountingGC.testGC();
        //testAllocation();
       // testPretenureSizeThreshold();
        testTenuringThreshold();
    }

    public static void testAllocation(){
        //System.out.println("start");
        byte[] allocation1 , allocation2, allocation3, allocation4;
        allocation1 = new byte[2* _1MB];
        allocation2 = new byte[2* _1MB];
        allocation3 = new byte[2* _1MB];
        allocation4 = new byte[4* _1MB];
        //System.out.println("end");
    }
    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation = new byte[4*_1MB]; //直接分配在老年代中
    }

    public static void testTenuringThreshold(){
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB/4];
        allocation2 = new byte[4*_1MB];
        allocation3 = new byte[4*_1MB];
        allocation3 = null;
        allocation3 = new byte[4*_1MB];
    }
}
