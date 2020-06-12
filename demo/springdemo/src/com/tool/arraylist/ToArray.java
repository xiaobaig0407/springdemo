package com.tool.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @package com.tool.arraylist
 * @author baiyutao
 * @date 2020/5/12 下午4:22
 * @version 1.0
 */
public class ToArray {
    public static void main(String[] args) {
        /**
         * 集合转数组
         * 使用的就是Collection接口中的toArray方法
         * 集合转数组：可以对集合中的元素操作方法进行限定。不允许对其进行增删
         */
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        /**
         * toArray方法需要传入一个指定类型的数组
         * 长度该如何定义呢
         * 如果长度小于集合的size,那么该方法会创建一个同类型并和集合相同size的数组
         * 如果长度大于集合的size,那么该就会使用指定的数组，存储集合中的元素，其他位置默认为null
         * 所以建议最后长度指定为集合的size
         */
        String[] arr = list.toArray(new String[5]);
        System.out.println(Arrays.toString(arr));
    }
}
