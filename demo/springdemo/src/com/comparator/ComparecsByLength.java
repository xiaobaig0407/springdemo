package com.comparator;

import java.util.Comparator;

/**
 *
 * @package com.comparator
 * @author baiyutao
 * @date 2020/5/11 下午2:57
 * @version 1.0
 */
public class ComparecsByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int temp  = o1.length() -o2.length();
        return temp==0?o1.compareTo(o2):temp;
    }
}
