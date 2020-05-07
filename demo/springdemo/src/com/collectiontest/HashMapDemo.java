package com.collectiontest;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/6 下午5:06
 * @version 1.0
 */



import com.bean.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 将学生对象和学生的归属地通过键与值存储到map集合中
 */

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<Student, String>();
        hashMap.put(new Student("list", 28), "beijing");
        hashMap.put(new Student("wangtian", 12), "shanghai");
        hashMap.put(new Student("baibai", 123), "tianjing");
        Set<Student> keySet = hashMap.keySet();
        Iterator<Student> iterator = keySet.iterator();

    }
}
