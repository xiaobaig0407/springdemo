package com.Headfirst;

class GoodDog{
    private int size;
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;

    }
    void bark(int size){
        System.out.println("this sizeis"+this.size);//this.siz shi object zhi
        System.out.println("sizeis"+size);//size shi int size
        if(size > 60){
            System.out.println("woof");
        }else if(size > 14){
            System.out.println("ruff");
        }else{
            System.out.println("yip");
        }
    }
}
class GoodDoqTestDrive {
    public static void main(String[] args){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("dog one:" + one.getSize());
        System.out.println("dog two:" + two.getSize());
        one.bark(10);
        two.bark(20);
    }
}
