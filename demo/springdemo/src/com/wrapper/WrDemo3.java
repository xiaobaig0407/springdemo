package com.wrapper;

/**
 *
 * @package com.wrapper
 * @author baiyutao
 * @date 2020/5/14 上午12:44
 * @version 1.0
 */

import java.util.Arrays;

/**
 * 对一个字符串的数值进行从小到大的排序
 * "20 78 9 -7  88 36 29"
 *
 * 思路
 * 1.排序 我很熟。可以我只熟悉int
 * 2.如何获取到这个字符串中的这些需要排序的数值
 * 发现这个字符串都是空格来对数值进行分隔的
 * 所以就想到用字符串对象的切割方法将大串变成多个小串
 * 3.数值最终变成小字符串，怎么变成一个int数呢
 * 字符串-》基本类型可以使用包装类
 */
public class WrDemo3 {
    private static final String SPACE_SEPARATOR = " ";

    public static void main(String[] args) {
        String numStr = "20 78   9   -7  88 36 29";
        numStr = sortStringNumber(numStr);
        System.out.println(numStr);
        System.out.println("------");

        String[] sma = numStr.split(" ");
        int[] amp = new int[sma.length];
        int i = 0;
        for(String a : sma){
            amp[i] = Integer.parseInt(a);
            i++;
        }
        Arrays.sort(amp);
    }
    public static String sortStringNumber(String numStr){
        //将字符串变成字符串数组
        String[] sma = stringToArray(numStr);
        //将字符串数组变成Int数组
        int[] numArr = toIntArray(sma);
        //int数组排序
        mySortArray(numArr);
        //将排序后的int数组变成字符串
        String temp = arrayToString(numArr);
        return temp;
    }

    public static String arrayToString(int[] numArr) {
        StringBuilder sb = new StringBuilder();
        for(int x=0; x<numArr.length; x++){
            if(x != numArr.length -1){
                sb.append(numArr[x]+SPACE_SEPARATOR);
            } else{
                sb.append(numArr[x]);
            }
        }
        return sb.toString();
    }

    public static void mySortArray(int[] numArr) {
        Arrays.sort(numArr);
    }

    public static int[] toIntArray(String[] sma) {
        int[] amp = new int[sma.length];
        int i = 0;
        for(String a : sma){
            amp[i] = Integer.parseInt(a);
            i++;
        }
        return amp;
    }

    public static String[] stringToArray(String numStr) {
        String[] sma = numStr.split(SPACE_SEPARATOR+"+");
        return sma;
    }
}
