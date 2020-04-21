package com.basic.objtest;

/**
 *
 * @package com.basic.objtest
 * @author baiyutao
 * @date 2020/4/18 下午9:59
 * @version 1.0
 */

/**
 * 当成员变量和局部变量重名时，可以用关键字this来区分
 * this:代表对象，代表哪个对象呢。当前对象
 *      就是所在函数所属对象的引用
 *      简单说：哪个对象调用了this所在的函数，this就代表哪个对象了
 *      一个类当中所有的成员想要被执行，就必须要由对象调用 ，静态除外
 *
 * this也可以用于在构造函数中调用其它构造函数，注意只能定义在构造函数的第一行
 * 因为初始化动作要先执行
 */
class Person{
    int age;
    String name;

    Person(int age, String name){
        this(name);
        this.age = age;
    }

    public void show(){
        System.out.println("aaaaaa");
    }
    Person(String name){
        this.name = name;
    }

    public void speak() {
        System.out.println(name+" is "+age);
    }
}

public class ConstructTest {
    public static void main(String[] args) {
        ConstructTest.show();
    }

    public static void show(){
        Person person = new Person("xiaoming");
        person.show();
    }
}
