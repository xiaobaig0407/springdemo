package com.generic;

import com.bean.Person3;
import com.comparator.ComparatorByNamed;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 上午12:03
 * @version 1.0
 */
public class GenericDemo2 {
    public static void main(String[] args) {
        TreeSet<Person3> treeSet =
                new TreeSet<Person3>(new ComparatorByNamed());
        treeSet.add(new Person3("lisi", 21));
        treeSet.add(new Person3("lisi3", 11));
        treeSet.add(new Person3("lisi", 1132));
        treeSet.add(new Person3("lis0", 39));
        Iterator<Person3> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Person3 p = iterator.next();
            System.out.println(p.getName()+"..."+p.getAge());
        }
    }
}
