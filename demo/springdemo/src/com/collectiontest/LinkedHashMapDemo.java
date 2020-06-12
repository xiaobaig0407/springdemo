package com.collectiontest;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/10 下午1:25
 * @version 1.0
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        File f = null;
        HashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(7, "zhouqi");
        hm.put(3, "zhangsan");
        hm.put(1, "qianyi");
        hm.put(5, "wangyu");

        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> me = it.next();
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key+":"+value);
        }

    }
}
