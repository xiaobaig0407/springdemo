package com.exceptiontest;

/**
 *
 * @package com.exceptiontest
 * @author baiyutao
 * @date 2020/5/26 下午10:38
 * @version 1.0
 */

/**
 * try catch finnaly 代码组合特点
 * 1.try catch finnaly
 * 2.try catch(多个）当没有必要资源需要释放时，可以不用定义finnaly
 * 3.try finnaly 异常无法直接catch处理，但是资源需要关闭
 *      void show() throws AmException{
 *          try{
 *               //开启资源
 *               throw new AmException
 *          }finnaly(){
 *              //关闭资源
 *          }
 *
 *      }
 */
class Demo5{
    public int show(int index) throws ArrayIndexOutOfBoundsException{
        if(index < 0){
            throw new ArrayIndexOutOfBoundsException("越界");
        }
        int[] arr = new int[3];
        return arr[index];
    }
}

public class ExcepDemo5 {
    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        try{
            int num = demo5.show(-3);
            System.out.println("num="+num);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
            return ;
        }finally {//通常用于关闭或者释放资源
            System.out.println("finnaly");
        }
        System.out.println("over");
    }
}

