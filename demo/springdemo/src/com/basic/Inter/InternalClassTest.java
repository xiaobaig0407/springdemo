package com.basic.Inter;

/**
 *
 * @package com.basic
 * @author baiyutao
 * @date 2020/4/25 下午2:11
 * @version 1.0
 */

/**
 * 相当于定义在外部类的成员变量上
 * 内部类访问特点：
 * 1.内部类可以直接访问外部类的成员
 * 2.外部类要访问内部类，必须建立内部内的对象
 *
 * 如果内部类中定义了静态成员该内部类也必须是静态的
 *
 * 一般用于类的设计。
 * 分析事物时，发现该事物描述中还有事物，而且这个事物还在访问被描述事物的内容。
 * 这时就是还有的事物定义成内部类来描述。
 */

class Outer {
    private int num = 3;
    private static int nump = 9;

    //内部类,为了访问方便
    class Inner {
        void show() {
            System.out.println("show run " + num);
        }
    }

    //静态内部类,为了访问方便
    static class Innerdemo {
        void showm() {

            System.out.println("showm run " + nump);
            //报错因为num是一个非静态的
//            System.out.println("showm run " + num);
        }
        //方法如果是静态的
        static void showt(){
            System.out.println("showt run "+nump);
        }
    }

    public void method() {
        Inner inner = new Inner();
        inner.show();
    }
}

class Outer2 {
    class Inner2 {

    }
}

public class InternalClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
        //直接访问外部类中的内部类中的成员
        //外部类.内部类 am = 外部类对象.内部类对象
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
        //如果内部类是静态的，相当于外部类
        Outer.Innerdemo oit = new Outer.Innerdemo();
        oit.showm();
        //如果内部类是静态的，成员是静态的
        //外部类.内部类.静态方法
        Outer.Innerdemo.showt();

    }
}
