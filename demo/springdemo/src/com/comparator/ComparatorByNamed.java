package com.comparator;

import com.bean.Person3;

import java.util.Comparator;

/**
 *
 * @package com.comparator
 * @author baiyutao
 * @date 2020/5/7 上午12:24
 * @version 1.0
 */
public class ComparatorByNamed implements Comparator<Person3> {
    @Override
    public int compare(Person3 o1, Person3 o2) {
        int temp = o1.getName().compareTo(o2.getName());
        return temp==0?o1.getAge()-o2.getAge():temp;
    }
}
