package com.tool.news;

/**
 *
 * @package com.tool.news
 * @author baiyutao
 * @date 2020/5/12 下午5:01
 * @version 1.0
 */
public class ParameterDemo {
    public static void main(String[] args) {
       /* int sum = add(4,5);
        System.out.println("sum=="+sum);
        int sum1 = add(4,5,6);
        System.out.println("sum1=="+sum1);*/
     /*  int[] arr = {3,1,8,4};
       int sum1 = add(arr);
        System.out.println(sum1);*/
        newAdd(5,1,4,7,3);

    }

    /**
     * 函数的可变参数
     * 其实就是一个数组，但是接收的是数组的元素。
     * 自动将这些元素封装成数组，简化了调用者的书写
     *
     * 注意：可变参数类型，必须定义在参数列表的结尾
     * @param arr
     * @return
     */
    public static int newAdd(int a, int... arr) {
        System.out.println(a);
        System.out.println(arr);
        return 0;
    }

    public static int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }


}
