package com.basic.extendstest;

/**
 *
 * @package com.basic.extendstest
 * @author baiyutao
 * @date 2020/4/21 下午5:24
 * @version 1.0
 */

/**
 *
 *
 * 在子类构造对象时，发现访问子类构造函数时父类也运行了，为什么呢？
 *      原因是在子类的构造函数中第一行有一个默认的隐式语句super()，是父类中空参数的构造函数;
 *
 * 子类的实例化过程：子类中所有的构造函数默认都会访问父类中的空参数的构造函数
 *
 * 为什么子类实例化的时候要访问父类中的构造函数呢？
 *      那是因为子类继承了父类，获取到了父类中的内容（属性），所以在使用父类内容之前要先看
 *      父类是如何对自己的内容进行初始化的。
 *
 *      所以子类在构造对象是，必须访问父类中的构造函数，为了完成必须的动作，就在子类的构造函数中加入了super（）语句.
 *
 *      如果父类中没有定义空参数构造函数，那么子类的构造函数必须用super明确要调用父类中哪个
 *      构造函数,同时子类的构造函数中如果使用了this调用了本类构造函数时，那么super就没有了，因为super和this都只能
 *      定义在第一行，所以只能有一个，但是可以保证的是子类中肯定会有其它的构造函数访问父类的构造函数
 *
 *      注意：super语句必须要定义在子类构造函数第一行。因为父类的初始化动作要先完成。
 *
 */


class Fu4{
    int num;
    public Fu4(int x) {
        num = 9;
        System.out.println("fu run");
    }

    public Fu4( ) {
        System.out.println("aaa");
    }
}

class Zi4 extends Fu4{
    public Zi4() {
        //super();调用的就是父类中空参数的构造函数
        //super();
        System.out.println("zi runrer");
    }

    public Zi4(int x) {
        //super();调用的就是父类中空参数的构造函数
        this();
       // super();
        System.out.println("zi run"+num);
    }
}
public class TestDemo4
{
    public static void main(String[] args) {
        new Zi4(8);
    }
}
