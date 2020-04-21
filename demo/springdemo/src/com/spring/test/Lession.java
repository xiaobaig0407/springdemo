package com.spring.test;

import java.util.ArrayList;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.test
 * @date 2020/4/17 下午6:06
 */

class A {
      int num = 1023;

    public int getNum() {
        return this.num;
    }
}
//访问实例变量取决于该变量的声明类型
class Lb extends A{
    int num = 15;
}
interface B {int num=1;} //定义接口
//调用this变量时，方法在哪个类里面就调用当前类的变量，使用父类构造方法
//多态调用实例变量时，该值取决于变量的声明类型
public class Lession extends A implements B{
    private int num = 99;
    public static void main(String[] args){
        Lession lession=new Lession();
        A am = lession;
        A cm  = new Lb();
        System.out.println(lession.getNum());
        System.out.println(lession.num);
        System.out.println(am.num);
        System.out.println(am.getNum());
        System.out.println(cm.num);
        System.out.println(cm.getNum());
    }
}
