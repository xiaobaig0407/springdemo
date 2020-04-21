package com.Headfirst;

class TokyoFather{
    int i = 100;
    public void func1(){

        func2();
    }
    //这是父类中的func2()方法，因为下面的子类中重写了该方法
//所以在父类类型的引用中调用时，这个方法将不再有效
//取而代之的是将调用子类中重写的func2()方法
    public void func2(){
        System.out.println(i);
        System.out.println("AAA");
    }

    public void nihoa(){
        System.out.println("aaaaa");
    }
}

class Midda extends TokyoFather{
    public void func1(){
        System.out.println("BBB");
    }
}
class Child extends TokyoFather{
    //func1(int i)是对func1()方法的一个重载，主要不是重写！
//由于在父类中没有定义这个方法，所以它不能被父类类型的引用调用
//所以在下面的main方法中child.func1(68)是不对的
    int i = 70;
    public String  func1(int i){
        System.out.println("aaaaa");
        return "9999";
    }
    //func2()重写了父类Father中的func2()方法
//如果父类类型的引用中调用了func2()方法，那么必然是子类中重写的这个方法
    public void func2(){
        System.out.println(i);
        System.out.println("CCC");
    }

    public boolean nihoa(int a){
        System.out.println("nohos");
        return true;
    }
}
public class DongTai {
    public static void main(String[] args) {
        TokyoFather chd = new Child();
        Child mychi = new Child();
        System.out.println(chd);
        System.out.println(chd.i);
        chd.func1();//打印结果将会是什么？
        Child cma = (Child)chd;
        System.out.println(cma);
        System.out.println(chd);
        cma.nihoa();

        mychi.nihoa(8);
//        chd.func1(68);
    }
}