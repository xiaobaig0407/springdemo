package com.generic;

import com.bean.Person3;

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
public class GenericAdvanceDemo5 {
    public static void main(String[] args) {
        ArrayList<Person3> a3 = new ArrayList<Person3>();
        a3.add(new Person3("abc", 124));
        a3.add(new Person3("abc4", 124));

        ArrayList<Person3> a4 = new ArrayList<Person3>();
        a4.add(new Person3("abc222", 124));
        a4.add(new Person3("abc4222", 23));

        a3.containsAll(a4);

        ArrayList<String> al4 = new ArrayList<String>();
        al4.add("abcdef");
        al4.add("abc");

        a3.containsAll(al4);
        Iterator<Person3> st = a3.iterator();
        while(st.hasNext()){
            System.out.println(st.next().toString());
        }

    }

}

class MyCollection5<E>{
    public boolean containsAll(Collection<?> al){
        return true;
    }
}


