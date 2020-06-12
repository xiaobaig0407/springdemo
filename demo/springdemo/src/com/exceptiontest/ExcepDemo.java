package com.exceptiontest;

/**
 *
 * @package com.exceptiontest
 * @author baiyutao
 * @date 2020/5/15 下午2:25
 * @version 1.0
 */

/**
 * 异常是在运行时期发生的不正常情况
 *
 * 在java中用类的形式对不正常情况进行了描述和封装对象
 *
 * 描述不正常的情况的类，被称为异常类
 * 以前正常流程代码和问题处理代码相结合 ，
 * 现在将正常流程代码 和问题处理代码分离，提高阅读性
 * 其实异常就是java通过面向对象的思想将问题封装成了对象，
 *
 * 不同的问题用不同的类进行具体描述，比如角标越界，空指针
 *
 * 问题很多，意味着描述的类也很多，将其共性进行向上抽取，就形成了体系。
 *
 * 最终问题（不正常情况）分成2大类
 * Throwable:无论是error还是异常都是问题，问题发生就应该可以抛出，让调用者知道并处理。
 *              //该体系的特点就在于Throwable 及其所有的子类都具有可抛性
 *              可抛性到底指的是什么呢？怎么体现可抛性呢？
 *              其实是通过两个关键字来体现的
 *              throws , throw ，凡是可以被这两个关键字所操作的类和对象都具备可抛性
 *      |--1.一般不可处理的。Error
 *              特点：是由jvm抛出的严重性问题，这种问题发生一般不针对性处理，
 *                   这种问题发生一般不针对性处理，直接修改程序
 *
 *      |--2.可处理的 . Exception
 *              特点：
 *
 *该体系的特点：
 *      子类的后缀名都是用其父类名作为后缀，阅读性强。
 *
 * Runnable:
 */
public class ExcepDemo {
    public static void main(String[] args) {
        //java.lang.ArrayIndexOutOfBoundsException
        int[] arr = new int[3*1024*1024*1024*1024*1024*1024^13];
       // System.out.println(arr[3]);
    }

    public static void sleep(int time){
        if(time<0){
            new FuTime();
        }
        System.out.println("sleep...."+time);
    }
}
class FuTime{

}
