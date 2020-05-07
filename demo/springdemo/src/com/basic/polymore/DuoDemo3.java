package com.basic.polymore;

/**
 *
 * @package com.basic.polymore
 * @author baiyutao
 * @date 2020/4/24 上午12:15
 * @version 1.0
 */

/**
 * 覆盖只发生在函数上和变量没关系
 * 多态时成员的特点
 * 1.成员变量
 *      编译时：参考引用型变量所属的类中是否有调用的成员变量，有则编译通过，没有则编译失败
 *      运行时：参考引用型变量所属的类中是否有调用的成员变量，并运行该属类中的成员变量
 *      简单说：编译和运行都参考等号的左边
 *      作为了解。
 * 2.成员函数（非静态） 因为它是被对象调用的
 *      编译时：参考引用型变量所属的类中是否有调用的函数，有则编译通过，没有则编译失败
 *      运行时：参考的是对象所属的类中是否有调用的函数。
 *      简单说：编译看左边，运行看右边
 *
 * 3.静态函数
 *      编译时：参考引用型变量所属的类中是否有调用的静态方法
 *      运行时：参考引用型变量所属的类中是否有调用的静态方法
 *      简单说：编译和运行都看左边
 *
 *      其实对于静态方法，是不需要对象的，直接用类名调用即可。
 */

class Fu{
    int num = 3;
    void show(){
        System.out.println(this);
        System.out.println("成员函数：fu show");
    }
    static void method(){
        System.out.println("静态函数编译和运行都看左边：fu staic method");
    }
    void showNum(){
        System.out.println("fu show"+this.num+"。。。");
    }
    void showThisNum(){
        System.out.println("包含this变量的方法不存在子类则用fu show中的变量"+this.num+"。。。");
    }
}
class Zi extends Fu{
    int num = 4;
    static void method(){
        System.out.println("静态函数：zi static method");
    }
    void show(){
        System.out.println(this);
        System.out.println("成员函数编译看左边运行看右边：zi show");
    }
    void showNum(){
        System.out.println("包含this变量的方法存在于子类则用zi show中的变量"+this.num+
                "。。。"+super.num);
    }


}
//对象的field不具备多态性，系统总是试图访问它编译时类型所定义的field

public class DuoDemo3 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        //成员变量编译和运行都看左边
        System.out.println("成员变量编译和运行都看左边所以为Fu:"+fu.num);
        //静态函数
        fu.method();
        //直接Fu.method就可
        Fu.method();
        Zi.method();
        //成员函数，编译看左边，运行看右边
        fu.show();
        //成员函数中的this变量,实际方法在father存在则用father,在son存在则用son
        fu.showNum();
        fu.showThisNum();

    }
}
