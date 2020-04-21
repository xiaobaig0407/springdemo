package com.col;

import java.util.ArrayList;

public class TestGene1 {
    public static void main(String[] args){
        new TestGene1().go();
    }

    public void go(){
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs);
        takeAnimalsT(dogs);
    }

    public void goTest(){
        Dog[] dogs = {new Dog(),new Dog(),new Dog()};
        takeAnimalsTest(dogs);

    }

    public void takeAnimals(ArrayList<? extends Animal> animals){

        for(Animal a: animals){
            a.eat();
        }
    }

    public <T extends Animal> void takeAnimalsT(ArrayList<T> animals){

        for(Animal a: animals){
            a.eat();
        }
    }

    public void takeAnimalsTest(Animal[] animals){
        animals[0] = new Cat();
        for(Animal a: animals){
            a.eat();
        }
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eat");
    }
}

class Dog extends Animal{
    void bark(){};
}

class Cat extends Animal{
    void miao(){}
}