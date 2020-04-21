package com.basic.extendstest;

/**
 *
 * @package com.basic.extendstest
 * @author baiyutao
 * @date 2020/4/21 上午12:18
 * @version 1.0
 */

/**
 * 当子父类中出现成员函数一模一样的情况会运行子类的函数，这种现象称为覆盖操作。
 * 这是函数在子父类中的特性。
 *
 * 函数两个特性：
 *      1.重载：同一个类中
 *      2.覆盖： 子类中。覆盖也称为重写
 *
 * 覆盖注意事项：
 *      1.子类方法覆盖父类时，子类权限必须大于等于父类的权限
 *      2.静态只能覆盖静态，或者被静态覆盖
 */
class Fu2{
   static void show(){
        System.out.println("fu show run");
    }
}

class Zi2 extends Fu2{


    static void show(){
        System.out.println("zi show run ");
    }
}

public class TetsDemo3 {
    public static void main(String[] args) {
        NewPhone p = new NewPhone();
        p.show();
    }
}

/**
 * 什么时候使用覆盖操作
 *
 * 当对一个类进行子类的扩展时，子类需要保留父类的功能声明
 * 但是要定义子类中该功能的特有内容时，就使用覆盖操作完成
 */

class Phone {
    void call(){

    }


    void show(){
        System.out.println("number");
    }
}

//多态
class NewPhone extends Phone{

    @Override
    void show(){
        System.out.println("name");
        System.out.println("pic");
        super.show();
    }
}
