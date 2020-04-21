package com.basic.objtest;

/**
 *
 * @package com.basic.objtest
 * @author baiyutao
 * @date 2020/4/20 下午7:53
 * @version 1.0
 */

/**
 * 静态代码块
 * 随着类的加载而执行，但是只加载一次
 *
 * 作用
 *      用于给类进行初始化
 */
class StaticCode{
    static int num = 8;
    static{
        num = 10;
        num *= 3;
        System.out.println("haha");
    }
    StaticCode(){

    }

    static void show(){
        System.out.println(num);
    }
}

public class StaticDemo2 {

    static{
        System.out.println("bbbb");
    }
    public static void main(String[] args) {
        StaticCode.show();
    }
}
