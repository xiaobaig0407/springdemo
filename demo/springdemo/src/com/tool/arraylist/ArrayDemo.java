package com.tool.arraylist;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @package com.tool.arraylist
 * @author baiyutao
 * @date 2020/5/12 上午12:20
 * @version 1.0
 */
public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * Arrays:集合框架工具类，里面的方法都是静态的
         *
         */

        int[] arr = {3,1,5,6,3,6};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myToString(arr));
        System.out.println("------aslist------");
        /**
         * 重点： List asList(数组)将数组转成集合
         *
         * 好处：可以使用集合的方法操作数组中的元素
         * 注意数组的长度是固定的，所以对于集合的增删方法是不可使用的，
         * 否则会发生UnsupportedOperationException
         */
        String [] arrd = {"abc","haha","xixi"};
        boolean xixi = myContains(arrd, "xixi");
        System.out.println(xixi);
        List<String> list = Arrays.asList(arrd);
        System.out.println(list.contains("xixi"));
        //list.add("xiaxia");//UnsupportedOperationException
        System.out.println("------demo2-----");
        demoTwo();


    }

    public static void demoTwo(){
        /**
         * 如果数组中的元素是实体对象，那么转成集合时，直接将数组中的元素作为集合中
         * 的元素进行存储，如果数组中的元素是基本类型数值，那么会将该数组作为集合中的
         * 元素进行存储
         */
        int[] arr = {31,11,51,26};
        List<int[]> ints = Arrays.asList(arr);
        List<int[]> list = Arrays.asList(arr);
        System.out.println(list);
    }

    public static boolean myContains(String[] arr , String key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    public static String myToString(int[] ar){
        int imax = ar.length -1;
        if(imax == -1){
            return "[]";
        }
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i = 0; ; i++) {
            b.append(ar[i]);
            if(i == imax){
                return  b.append(']').toString();
            }
            b.append(", ");
        }

    }
}
