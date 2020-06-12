package com.exceptiontest;
import java.lang.Exception;
/**
 * 对于角标是正数不存在，可以用角标越界来表示
 * 对于负数为脚标，准备用负数角标异常来表示
 *
 * 负数角标异常并没有在Java中定义过，那就按照Java异常这种创建思想，
 * 面向对象，将负数角标进行自定义描述，并封装成对象
 *
 * 这种定自义的问题描述称为自定义异常
 *
 * 注意：如果让一个类称为异常类，必须要继承异常体系，因为只有称为异常体系的子类堵有资格具备可抛性
 *      才可以被贱两个关键字操作，throws throw
 *
 * 异常的分类
 * 1.编译时被检测的异常：只要是Exception和其子类都是，除了特殊子类RuntimeException体系
 *      这种问题一但出现，希望在编译时就进行检测 ，让这种问题有对应的处理方式，这样的问题可以针对性的处理。
 *
 * 2.编译时不检测异常（运行时异常）：就是Exception中的RuntimeException和其子类。
 *          这种问题的发生，无法让功能继续，运算无法进行，更多是因为调用的原因导致的或者引发了内部状态的改变
 *          导致的，那么这种问题一般不处理，直接编译通过，在运行时，让调用者调用程序时强制停止，让调用者对代码
 *          进行修正
 *
 * 所以自定义异常时，要么继承Exception,要么继承RuntimeException
 * throws 和throw区别
 * 1.throws使用在函数上，throw使用在函数内
 * 2.throws抛出的是异常类，可以抛出多个，用逗号隔开
 *   throw抛出的是异常对象
 *
 */


/**
 *
 * @package com.exceptiontest
 * @author baiyutao
 * @date 2020/5/24 下午12:57
 * @version 1.0
 */

class FushuIndexException extends Exception{
    FushuIndexException(){

    }

    public FushuIndexException(String message) {
        super(message);
    }
}



 class Demo2{
    public  int method(int[] arr,int index)throws FushuIndexException{
        if(arr == null){
            throw new NullPointerException();
        }
        if(index < 0 ){
            throw new FushuIndexException("角标变成负数了");
        }
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("数组的角标越界啦，哥们你是不是疯了"+index);
        }

        return arr[index];
    }
}

public class ExcepDemo3 {
    public static void main(String[] args) throws FushuIndexException {
        int[] arr = new int[3];
        Demo2 d  = new Demo2();
        int num = d.method(arr, -40);
    }

}
