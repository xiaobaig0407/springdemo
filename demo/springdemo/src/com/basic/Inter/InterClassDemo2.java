package com.basic.Inter;

/**
 *
 * @package com.basic.Inter
 * @author baiyutao
 * @date 2020/4/25 下午2:57
 * @version 1.0
 */

/**
 * 为什么内部类能直接访问外部类的成员
 * 那是因为内部类持有了外部类的引用。 外部类名.this
 *
 * 内部类可以存放在局部位置上。
 * 原理就是内部类在局部位置上只能访问局部中被final修饰的局部变量
 */
class Outerk{
    int num  = 9;
    class Innter{
        int num = 6;
        void show(){
            int num = 5;
            System.out.println("this value:"+this.num+"--局部:"+num);
            System.out.println("outer value:"+Outerk.this.num);
        }
    }
    void method(){
        new Innter().show();
    }
    void methodlocal(){
        final int x = 3;
        class Intest{
            void  shop(){
                System.out.println("内部类局部位置shop"+num);
                System.out.println("内部类局部位置xshop"+x);
            }
        }
        Intest intetst = new Intest();
        intetst.shop();
    }
}

public class InterClassDemo2 {
    public static void main(String[] args) {
//        new Outerk().method();
        new Outerk().methodlocal();
    }
}
