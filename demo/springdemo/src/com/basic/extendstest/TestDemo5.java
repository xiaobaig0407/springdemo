package com.basic.extendstest;

/**
 *
 * @package com.basic.extendstest
 * @author baiyutao
 * @date 2020/4/21 下午6:21
 * @version 1.0
 */


/**
 * 一个对象实例化过程：
 * Person p = new Person();
 * 1.jvm会读取指定路径下的Person.class文件，并加载进内存，并会先加载Person的父类（如果有直接父类的情况下）。
 * 2.在堆内存中开辟空间分配地址
 * 3.并在对象空间中，对对象中的属性进行默认初始化
 * 4.调用对应的构造函数进行初始化。
 * 5.在构造函数中，第一行会先调用父类中构造函数进行初始化。
 * 6.父类初始化完毕后，再对子类的属性进行显示初始化。
 * 7.再进行子类构造函数的特定初始化。
 * 8.初始化完毕后，将地址值赋值给引用变量
 */
class Fu5{
    int num = 9;
    private static int bar =  63;
    static {
        System.out.println("父类静态代码块");
        System.out.println(bar);
        System.out.println("父类静态变量");
    }
    {
        System.out.println("父类构造代码块");
        System.out.println(num);
        System.out.println("父类普通成员变量");
    }
    public Fu5() {
        System.out.println("父类构造方法");
        show();

    }
    void show(){
        System.out.println("fu show");
    }
}

class Zi5 extends Fu5{
    int num =8;
    private static int zijing = 12;
    static {
        System.out.println("子类静态代码块");
        System.out.println(zijing);
        System.out.println("子类静态变量");
    }
    {
        System.out.println("子类构造代码块");
        System.out.println(num);
        System.out.println("子类普通成员变量");
    }
    Zi5(){
        //默认隐藏super()
        //通过super初始化父类内容时，子类的成员变量并未显示初始化。等super()父类初始化完毕后，
        //才进行子类的成员变量显示初始化
        System.out.println("子类构造方法");
        System.out.println("zi cronrunm..."+num);
        System.exit(1);
    }
    void show(){
        System.out.println("zi show..."+this.num);
    }
}

public class TestDemo5 {
    public static void main(String[] args) {
        Zi5 z = new Zi5();
        z.show();
    }
}

