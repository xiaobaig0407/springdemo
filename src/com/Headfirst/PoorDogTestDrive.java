package com.Headfirst;

class PoorDog{
    private int size;
    private String name;

    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
}
public class PoorDogTestDrive {
    public static void main(String[] args){
        PoorDog one = new PoorDog();
        System.out.println("dog size is "+one.getSize());
        System.out.println("dog name is "+one.getName());
    }
}
