package com.generic;

import com.bean.Person3;
import com.bean.Student3;
import com.bean.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 下午2:03
 * @version 1.0
 */
public class GenericAdvanceDemo2 {
    public static void main(String[] args) {
        ArrayList<Worker> a1 = new ArrayList<Worker>();
        a1.add(new Worker("xiaoming", 24));
        a1.add(new Worker("heihei", 14));


        ArrayList<Student3> a2 = new ArrayList<Student3>();
        a2.add(new Student3("stu1", 124));
        a2.add(new Student3("stu2", 24));
        ArrayList<Person3> a3 = new ArrayList<Person3>();
        a3.add(new Person3("per1", 124));
        a3.add(new Person3("per2", 124));
        printCollection(a1);
        printCollection(a2);
        System.out.println("---------");
        printCollectionxia(a3);
    }

    /**
     * 迭代打印集合中元素
     *
     * 可以对类型进行限定：
     * ？extends E:接收E类型或者E的子类型对象。上限！
     * ？super E :接收E类型或者E类型的父类型。下限！
     * @param a2
     */
    private static void printCollection(Collection<? extends Person3> a2) {
        Iterator<? extends Person3> iterator = a2.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
            Person3 person3 = iterator.next();
            System.out.println(person3.getName() + ":" + person3.getAge());
        }
    }


    private static void printCollectionxia(Collection<? super Student3> a2) {
        Iterator<? super Student3> iterator = a2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
