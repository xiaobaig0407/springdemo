/**
 * 继承的好处：
 *      提高了代码的复用性
 *      让类与类之间产生了关系，给第三个特征多态提供了前提
 *
 * Java中支持单继承。不支持多继承，但对c++中的多继承机制进行改良
 *
 * 单继承：一个子类只能有一个直接父类
 * 多继承：一个子类可以有多个直接父类（Java中不允许，进行改良）
 *        不直接支持，因为有多个父类中有相同成员，会产生调用不确定性
 *
 *        在java中是通过"多实现"的方式来体现
 *
 * Java支持多层（多重）继承
 * C extends B, B extends A
 * 就会出现继承体系
 *
 * 当要使用一个继承体系时
 * 1.查看该体系中的顶层类，了解该体系的基本功能
 * 2. 创建体系中的最子类对象，完成该功能的使用
 *
 *
 * class Demo{
 *     void show1(){}
 * }
 * class DemoA{
 *
 *     void show2(){}
 * }
 *
 * class DemoB extends DemoA{
 *
 *     void show3(){}
 * }
 *
 * 什么时候定义继承呢？
 * 当类与类之间存在着所属关系时，就定义继承，xxx是yyy的一种。 xxx extends yyy
 * 所属关系：is a
 *
 */

package com.basic.extendstest;
//defalut 在同包内可访问
class Person{
    String name;
    int age;
}

class Student extends Person{
    void study(){
        System.out.println(name+" study.."+age);
    }
}

class Worker{
    String name;
    int age;
    void work(){
        System.out.println("worker work");
    }
}

/**
 * @author baiyutao
 * @version 1.0
 * @package com.basic.extendstest
 * @date 2020/4/17 下午10:37
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="xiaoming";
        student.age=20;
        student.study();
    }
}

