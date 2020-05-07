package com.collectiontest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/27 下午3:13
 * @version 1.0
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        show(list);
    }
    public static void show(List list){
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println(list);
        list.add(1, "abc9");
        System.out.println(list);
        //删除元素
        System.out.println("remove:"+list.remove(2));
        System.out.println(list);
        //修改元素
        Object mmmm = list.set(1, "kkkkk");
        System.out.println("set:"+mmmm);
        System.out.println(list);
        System.out.println("get:"+list.get(2));

        //获取子列表
        System.out.println("sublist"+list.subList(0,2));

    }
}
