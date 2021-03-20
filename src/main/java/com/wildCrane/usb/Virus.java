package com.wildCrane.usb;

import java.io.File;

public class Virus {
    public static void main(String[] args) {
        File file = new File("G:\\.Trashes");
        delete(file);
        System.out.println("end end");
        //deleteS(file);
    }
    public static void delete(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File file1 :files){
                delete(file1);
            }
        }else {
                file.delete();
        }
    }
    public static void deleteS(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File file1 :files){
                if(file1.getName().contains(".Trashes")){
                    file.delete();
                }
            }
        }
    }
}
