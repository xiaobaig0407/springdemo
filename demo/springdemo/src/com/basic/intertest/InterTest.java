package com.basic.intertest;

/**
 *
 * @package com.basic.abstracttest
 * @author baiyutao
 * @date 2020/4/22 下午11:54
 * @version 1.0
 */

/**
 * 当一个抽象类中的方法都是抽象的时候，这时可以将抽象类用另一种形式来定义和表示就是接口
 * 即interface
 *
 * 对于接口当中常见的成员，而且这些成员都有固定的修饰符
 * 1全局常量 public static final
 * 2抽象方法 public abstract
 *
 * 由此得出结论，接口中的成员都是公共的权限
 */

//定义接口使用的关键字不是class,是interface

interface IntDemo{
    public static final int NUM = 4;
    public abstract void show1();
    public abstract void show2();
}

//类与类之间是继承关系，类与接口之间是实现关系

/**
 * 接口不可以实例化。只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，
 * 该子类才可以实例化，否则该子类就是一个抽象类
 */
class DemoImpl implements IntDemo{

    @Override
    public void show1(){

    }

    @Override
    public void show2() {

    }
}

/**
 * 在java中不直接支持多继承，因为会出现调用的不确定性
 * 所以java将多继承机制进行了改良，在java中变成了多实现
 *
 * 一个类可以实现多个接口
 */

interface A{
    public abstract void show();
}

interface Z{
    public abstract void show();
}

class Test implements A,Z  //多实现
{
    @Override
    public void show() {
        System.out.println(this);
    }

}

/**
 * 一个类在继承另一个类的同时还可以实现多个接口
 */

/**
 *
 */
interface CC{

}
interface DD{

}
//接口与接口之间是继承关系，而且接口可以多继承
//原理在于方法体不存在
interface BokTa extends CC,DD{

}

class Q{
    public void method(){

    }
}

class Testme extends Q implements A,Z{
    @Override
    public void show(){

    }
}

/**
 * 接口的出现避免了单继承的局限性
 */

/***
 * 接口是对外暴露的规则，是程序的功能扩展，降低藕合性
 * 鼠标笔记本紧密程度降低，简称降低耦合性
 * 键盘，u盘，都能插入， 提高笔记本功能扩展性
 */

public class InterTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
    }
}

