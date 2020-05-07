package com.collectiontest;

import java.util.*;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/6 下午3:06
 * @version 1.0
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        method(map);
        System.out.println("------------keyst");
        showkeyset(map);
        System.out.println("------------entrysett");
        showentryset(map);
        System.out.println("------------value");
        showvalues(map);
    }

    public static void showvalues(Map<Integer, String> map) {
        Collection<String> values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 结婚证书
     * @param map
     */
    public static void showentryset(Map<Integer, String> map) {
        System.out.println(map);
        /**
         * 通过Map转换成set就可以迭代
         * 找到了另一个方法，entrySet
         * 该方法半键和值的映射关系作为对象存储到set集合中
         * 而这个映射关系的数据类型就是Map.Entry类型（结婚证）
         */
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

    }

    /**
     * 丈夫
     * @param map
     */
    private static void showkeyset(Map<Integer, String> map) {
        map.put(8, "wangwu");
        map.put(3, "tian");
        map.put(6, "ren");
        map.put(2, "baibai");
        //取出map中所有元素，原理先通过keyset方法获取所有键所在的set集合，
        //再通过set的迭代器获取到每一个键，再对每一个键通过map集合的get方法获取对应的值即可
        Set<Integer> keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Integer key = (Integer) next;
            System.out.println(key);
            System.out.println(map.get(key));

        }

    }

    public static void method(Map<Integer, String> map) {//学号和姓名
        //添加元素
        System.out.println(map.put(8, "wangcai"));//null
        System.out.println(map.put(8, "xiaoming"));//wangcai 存相同键值会覆盖
        map.put(2, "zhaolu");
        map.put(3, "liuzi");
        System.out.println(map);
        //删除
        System.out.println("remove" + map.remove(2));
        System.out.println(map);
        //判断
        System.out.println("containskye:" + map.containsKey(3));
        //获取
        System.out.println("get:" + map.get(3));

    }
}
