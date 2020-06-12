package com.exceptiontest;

/**
 *
 * @package com.exceptiontest
 * @author baiyutao
 * @date 2020/5/15 下午6:14
 * @version 1.0
 */

class Demo{
    public  int method(int[] arr,int index){
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("数组的角标越界啦，哥们你是不是疯了"+index);
        }
        return arr[index];
    }
}

public class ExcepDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Demo d  = new Demo();
        int num = d.method(arr, 3);
    }

}
