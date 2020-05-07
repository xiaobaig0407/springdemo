package com.collectiontest;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/28 下午5:42
 * @version 1.0
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("abc1");
        v.addElement("abc2");
        v.addElement("abc3");

        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("next elen:"+enumeration.nextElement());
        }
        System.out.println("------");
        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println("next:"+iterator.next());
        }
    }

}
