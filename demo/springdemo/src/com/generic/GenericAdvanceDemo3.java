package com.generic;

import com.bean.Person3;
import com.bean.Student3;
import com.bean.Worker;

import java.util.ArrayList;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 下午2:03
 * @version 1.0
 */
public class GenericAdvanceDemo3 {
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

        ArrayList<String> al4 = new ArrayList<String>();


        a3.add(new Student3("xixi", 30));
        a3.addAll(a1);
//        a3.addall(al4);错误，类型不匹配。
       // a3.addAll(a2);
        System.out.println("---------");

    }

}

/**
 * 一般存储元素时通常用上限，因为这样取出都是按照上限类型来运算的不会出现类型安全隐患
 * @param <E>
 */
class MyCollection<E>{
    public void add(E e){

    }

    public void addAll(MyCollection<? extends E> e){

    }
}
