package com.shuzi;

import java.lang.reflect.Array;
import java.util.ArrayList;

//静态方法不能调用非静态变量，非静态方法
public class JingTai {
    private int size=19;
    public static final int Foo_M;
    //两种方式
    static {
        Foo_M = 9;
    }
    public static void main(String[] args){
        int x = Math.round(9.9f);
        System.out.println(x);
        ArrayList<Integer> listOf = new ArrayList<Integer>();
        listOf.add(33);
        System.out.println(listOf);
        int num = listOf.get(0);

    }

}
