package com.tool.news;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @package com.tool.news
 * @author baiyutao
 * @date 2020/5/12 下午4:35
 * @version 1.0
 */
public class ForeachDemo {
    public static void main(String[] args) {
        /**
         * foreach语句
         * 格式
         * for(类型 变量 ： Collection集合|数组）{
         * }
         *
         * 传统for和高级for的区别
         * 传统for可以完成对语句执行很多次，因为可以定义控制循环的增量条件。
         *
         * 高级for是一种简化形式必须有被遍历的目标。该目标要么是数组，要么是Collection集合。
         * 对数组的遍历如果仅仅是获取数组中的元素可以使用高级for
         * 如果要对数组的角标进行操作建议使用传统for
         */
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

        for(String name:  list){
            System.out.println(name);
        }
        int [] arr = {3,1,5,6};
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("----------");

        //可以使用高级for遍历map集合？不能直接用但是可以将map转成单列set就可用
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(3,"zhangsan");
        map.put(1,"wangyi");
        map.put(7,"wangyu");
        for(Integer key : map.keySet()){
            String valu = map.get(key);
            System.out.println(key+":"+valu);
        }
        System.out.println("-------entry-----");
        for(Map.Entry<Integer, String> me : map.entrySet()){
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key+":"+value);
        }

    }
}
