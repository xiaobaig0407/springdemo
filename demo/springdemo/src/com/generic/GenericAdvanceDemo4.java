package com.generic;

import com.bean.Person3;
import com.bean.Student3;
import com.bean.Worker;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 下午2:03
 * @version 1.0
 */
public class GenericAdvanceDemo4 {
    public static void main(String[] args) {
        TreeSet<Person3> a11 = new TreeSet<Person3>(new ComparatorByNamea());
        a11.add(new Person3("abc4", 34));
        a11.add(new Person3("abc1", 30));
        a11.add(new Person3("abc2", 38));


        TreeSet<Student3> a12 = new TreeSet<Student3>(new ComparatorByNamea());
        a12.add(new Student3("stu1", 38));
        a12.add(new Student3("stu7", 22));
        a12.add(new Student3("stu2", 20));

        TreeSet<Worker> a13 = new TreeSet<Worker>();
        a13.add(new Worker("per9", 124));
        a13.add(new Worker("per2", 14));

        TreeSet<String> a14 = new TreeSet<String>();

        Iterator<Person3> it = a11.iterator();
        System.out.println("per---------per");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("stu---------stu");
        Iterator<Student3> st = a12.iterator();
        while(st.hasNext()){
            System.out.println(st.next());
        }

    }

}

/**
 * class TreeSet<Student>{
 *    TreeSet(Comparator<? super Worker> comp)
 * }
 * 什么时候用下限呢？
 * 通过对集合中的元素进行取出操作时，可以使用下限。
 *
 */
class ComparatorByNamea implements Comparator<Person3>{

    @Override
    public int compare(Person3 o1, Person3 o2) {
        int temp = o1.getName().compareTo(o2.getName());
        return temp==0?o1.getAge()-o2.getAge():temp;
    }
}

class ComparatorByStuName implements Comparator<Student3>{

    @Override
    public int compare(Student3 o1, Student3 o2) {
        int temp = o1.getName().compareTo(o2.getName());
        return temp==0?o1.getAge()-o2.getAge():temp;
    }
}


