package com.GouZao;
class Animal{
    public Animal(int a){
        System.out.println("make an animal");
    }
    public Animal(){
        System.out.println("make an animalemtpy");
    }

}

class Hippo extends Animal{
    public Hippo(){
        this(10);
        System.out.println("make an aaa");
    }
    public Hippo(int i){
        System.out.println("make an hippo"+i);
    }
}

public class TestHippo {
    public static void main(String[] args){
       // Hippo h =new Hippo();
        Hippo ha =new Hippo();
    }
}
