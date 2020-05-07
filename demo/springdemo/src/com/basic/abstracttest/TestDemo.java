package com.basic.abstracttest;

/**
 *
 * @package com.basic.abstracttest
 * @author baiyutao
 * @date 2020/4/22 上午12:58
 * @version 1.0
 */

import java.util.ArrayList;

/**
 * 抽象类
 * 抽象： 笼统，模糊， 看不懂！不具体。
 * 当一个类在描述事物的时候，没有足够的信息来描述这个事物，这个类就是抽象的。
 *
 * 特点
 * 1.方法只有声明没有实现时，该方法就是抽象方法，需要被abstract修饰
 *      抽象方法必须定义在抽象类中，该类必须被abstract修饰。
 * 2. 抽象类不可以被实例化。为什么？因为调用抽象方法没有意义
 * 3.抽象类必须有其子类覆盖了所有的抽象方法后，该子类才可以实例化，否则该子类还是抽象类
 *
 * 1.抽象类中有构造函数吗？
 *      有，用于给子类对象初始化
 * 2.抽象类可以不定义抽象方法吗？
 *      可以的。但是很少见，目的就是不让该类创建对象，AWT的适配器对象就是这种类。
 *      通常这个类中的方法有方法体，但是却没有内容
 *      abstract class Demo{
 *          void show1(){}
 *          void show2(){}
 *      }
 * 3.抽象关键字不可以和哪些关键字共存
 *      private 不行
 *      static 不行
 *      final  不行
 * 4.抽象类和一般类的区别
 *      相同点：抽象类和一般类都是用来描述事物，都在内部定义了成员。
 *      不同点：1.一般类有足够的信息描述事务，而抽象类描述事物的信息有可能不足。
 *             2.一般类中不能定义抽象方法只能定义非抽象方法，抽象类中可以定义抽象方法同时可以定义非抽象方法
 *             3.一般类可以被实例化，抽象类不可以被实例化
 * 5.抽象类一定是个父类吗？
 *      是的.因为需要子类覆盖其方法后才可以对子类实例化
 */
abstract class Demo{
    //抽象
    abstract void show();

    public Demo() {
        System.out.println("fu");
    }
    public void say(){
        System.out.println("heelo mo");
    }
}

abstract class Demop extends Demo{
    public int rm = 77;
    public static void bar(){
        System.out.println("heelo mo");
    }
}

class DemoA extends Demop{
    @Override
    void show(){
        System.out.println("demoa");
    }
}

class DemoB extends Demo{
    @Override
    void show(){
        System.out.println("demob");
    }
}

abstract class Quan{
   abstract void bark();
}

class Dog{
    void bark(){
        System.out.println("wangwang");
    }
}

class Wolf{
    void bark(){
        System.out.println("aoao");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Demop.bar();
        DemoA ra = new DemoA();
        System.out.println(ra.rm);
    }
}
