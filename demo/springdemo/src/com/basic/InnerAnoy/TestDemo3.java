package com.basic.InnerAnoy;

/**
 *
 * @package com.basic.InnerAnoy
 * @author baiyutao
 * @date 2020/4/25 下午8:41
 * @version 1.0
 */
class Outer6{

    /*
    aaaa点
    class Inner extends Object{
        public void show(){
            System.out.println("show run");
        }
    }
    new Inner().show();
    */

    void method(){
        //创建object子类对象 其实相当于aaaa点,new object(){},相当于一个子类其实就是多态
        // Object objm = new Zi();
        Object objm  = new Object(){
            public void show(){
                System.out.println("show run");
            }
        };
       // objm.show();
        //因为匿名内部类这个子类对象向上转型为Object类型，这样就不能使用子类特有show方法
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        new Outer6().method();
    }
}
