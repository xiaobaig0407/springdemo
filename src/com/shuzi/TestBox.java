package com.shuzi;


import java.util.Calendar;
import java.util.Date;

public class TestBox {
    Integer i;
    int j;
    public static void main(String[] args){
        TestBox t = new TestBox();
        t.go();
        String s = String.format("%, d", 1000000);
        System.out.println(s);
        System.out.println(String.format("i hava %.2f bugs", 475.0889));
        System.out.println(String.format("i hava %d bugs", 42));
        System.out.println(String.format("%tc", new Date()));
        Calendar cal =  Calendar.getInstance() ;
        System.out.println(cal);
    }
    public void go(){
        System.out.println(j);
        System.out.println(i);
    }
}
