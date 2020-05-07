package com.basic.objtest;

/**
 *
 * @package com.basic.objtest
 * @author baiyutao
 * @date 2020/4/19 上午11:52
 * @version 1.0
 */

/**
 * 实例变量：
 * 静态变量：类能直接访问的变量，类变量
 *
 * STATIC特点：
 * 1.static是一个修饰符，用于修饰成员
 * 2.static修饰的成员被所有的对象所共享
 * 3.static优先于对象创建存在，因为static的成员随着类的加载已经存在了
 * 4.static修饰的成员多了一种调用方式，可以直接被类名所调用 ，格式：Class., 类名.静态成员
 * 5.static修饰的数据是共享数据，对象中存储的是特有数据
 *
 * 成员变量和静态变量区别？
 * 1.两个变量的生命周期不同。
 *      成员变量随着对象创建而存在，随着对象回收被释放
 *      静态变量随之着类的加载而存在，随着类的消失而消失。
 *
 * 2.调用方式不同
 *      成员变量只能被对象调用 。
 *      静态变量可以被对象调用，还可以被类名调用（建议用类名）
 * 3. 别名不同
 *      成员变量也称为实例变量
 *      静态变量称为类变量
 * 4. 数据存储位置不同
 *      成员变量数据存储在堆内存的对象中，所以也叫对象的特有数据。
 *      静态变量数据存储在方法区（共享数据区）的静态区，所以也叫对象的共享数据
 *
 * 静态使用的注意事项：
 * 1. 静态方法只能访问静态成员（非静态可以访问静态，又可以访问非静态）
 * 2. 静态方法中不可以使用this或者super关键字
 * 3. 主函数是静态的。
 *   静态前面省略的是类名，非静态省略的是this
 */
class People{
    String name;
    protected static String country = "cn";
    //构造对象代码块，可以给所有对象进行初始化
    {
        System.out.println("peope run");
        cry();
    }
    //是给对应的对象进行针对性的初始化
    People(){
        name = "baby";
    }
    People(String name){
        this.name = name;

    }
    public void cry(){
        System.out.println("wawa");
    }

    public  void show(){
        System.out.println("8888");

    }
    public void speak(){
        System.out.println("name:"+name);
    }

}

public class StaticTest {
    int num = 4;
    public static void main(String[] args) {
       /* People p = new People();
        p.name = "xiaoming";
        System.exit(1);
        p.show();
        System.out.println(p.country);
        System.out.println(People.country);*/
        People p1 = new People();
        People p2 = new People("wangcai");
        p1.speak();
        p2.speak();
        new People();
    }

    public static void show(){

        People people  = new People();
        people.show();
    }
}
