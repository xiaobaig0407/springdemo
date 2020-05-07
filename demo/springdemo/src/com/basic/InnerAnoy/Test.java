package com.basic.InnerAnoy;

/**
 *
 * @package com.basic.InnerAnoy
 * @author baiyutao
 * @date 2020/4/25 下午5:36
 * @version 1.0
 */

/**
 * 匿名内部类，就是内部类的简写格式
 *      必须有前提：
 *      内部类必须继承或者实现一个外部类或者接口
 *
 * 匿名内部类其实就是一个匿名子类对象
 * 格式： new 父类or接口名(){子类内容};
 */
abstract class Demo{
    abstract void show();
}

class Outer{
    int num = 4;
    /*class Inner extends Demo{
        void show(){
            System.out.println("show"+num);
        }
    }*/
    public void method(){
        //一个抽象类的子类
        new Demo(){
            void show(){
                System.out.println("show"+num);
            }
            void haha(){
                System.out.println("ni haha");
            }
        }.haha();

    }
}

public class Test {
    public static void main(String[] args) {
        new Outer().method();
    }
}
