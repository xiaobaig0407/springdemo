package com.duotai;

class Father{
    void print(){};
}

class Son extends Father{
    void print(){System.out.println("子类中！");}
    void show(){System.out.println("show 中！");}
}


class Demo{
    public static void main(String args[]){
        Father obj=new Son();
        obj.print();
//        obj.show();  //这个调用会报错！，即指向子类对象的父类引用不能调用父类有而子类没有的方法
    }
}
