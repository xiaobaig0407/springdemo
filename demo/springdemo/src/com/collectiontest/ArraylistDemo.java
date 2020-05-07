package com.collectiontest;

import com.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/29 上午12:24
 * @version 1.0
 */

//装箱：基本数据类型赋给引用类型
    //Object num = new Inter(6); Inter number = 6;
public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Person("lisi1", 21));
        arrayList.add(new Person("lisi2", 21));
        arrayList.add(new Person("lisi3", 21));
        arrayList.add(new Person("lisi4", 21));

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
           // System.out.println(iterator.next());
            Object next = iterator.next();
            Person person = (Person) next;
            System.out.println(next);
            System.out.println(person.getName()+"--"+person.getAge()+"--"+person.getClass());
        }

    }
}
