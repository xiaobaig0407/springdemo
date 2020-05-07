package com.collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/26 下午6:17
 * @version 1.0
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection  coll = new ArrayList();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");

        //使用Collection的iterator（）方法,调用集合中的迭代器方法，是为了获取集合中的迭代器对象
        Iterator iterator =  coll.iterator();
        while (iterator.hasNext()){
            Object obj  = iterator.next();
            System.out.println(obj);
            System.out.println(obj.hashCode());
            System.out.println(obj.toString());
            System.out.println(obj.getClass());
            System.out.println(obj.getClass());
        }
        for (Iterator iteratorm =  coll.iterator(); iteratorm.hasNext();) {
            System.out.println(iteratorm.next());
        }
    }
}
