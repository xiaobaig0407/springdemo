package com.collectiontest;

import java.util.LinkedList;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/28 下午7:11
 * @version 1.0
 */
public class DuiLie {
    private LinkedList link;

    public DuiLie() {
        link = new LinkedList();
    }

    public void myAdd(Object obj) {
        this.link.addLast(obj);
    }

    public Object myGet() {
        return this.link.removeFirst();
    }

    public boolean isEmpty() {
        return this.link.isEmpty();
    }
}
