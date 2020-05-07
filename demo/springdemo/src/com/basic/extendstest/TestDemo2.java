package com.basic.extendstest;

/**
 *
 * @package com.basic.extendstest
 * @author baiyutao
 * @date 2020/4/21 上午12:01
 * @version 1.0
 */

/**
 * 子类先加载父类
 *
 * 方法区是代码 ，运算区是栈堆,成员变量一定要存入在堆里面
 *
 * 成员变量，静态方法看左边
 *
 * 非静态方法：编译看左边运行看右边
 */

class Fut{
    int num = 4;
    void show(){
        System.out.println(this.num+"....");
    }
    static void bar(){
        System.out.println("8888");
    }

}
class Zit extends Fut{
    int num = 5;
    void show(){
        System.out.println(this.num+"...."+super.num);
    }

    static void bar(){
        System.out.println("999");
    }

}


public class TestDemo2 {
    public static void main(String[] args) {
        Fut f = new Zit();
        System.out.println(f.num);
        f.show();
        f.bar();
    }
}
