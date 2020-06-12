package com.wrapper;

/**
 *
 * @package com.wrapper
 * @author baiyutao
 * @date 2020/5/14 上午12:07
 * @version 1.0
 */
public class WrDemo2 {
    public static void main(String[] args) {
        int num = 4;
        //i = new Integer(4) ; 自动装箱简化书写
        Integer i = 4;
        // i = new Integer(i.intValue()+6); //i.intValue() 自动拆箱
        i = i+6;
        System.out.println(i.getClass());
        show(55);

        Integer a = new Integer(127);
        Integer b = new Integer(127);
        //false
        System.out.println(a==b);
        //true
        System.out.println(a.equals(b));
//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享，不会重新开辟空间
        Integer x = 129;
        Integer y = 129;
        //true
        System.out.println(x==y);
        //true
        System.out.println(x.equals(y));
    }
    // Object a = new Integer(55);
    public static void show(Object a){
        System.out.println("a="+a);
        System.out.println(a.getClass());

    }
}
