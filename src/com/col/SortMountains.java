package com.col;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList <Mountain> mtn = new LinkedList<Mountain>();
    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two){
            return one.name.compareTo(two.name);
        }
    }
    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two){
           return one.height.compareTo(two.height);
        }
    }

    public static void main(String[] args){
        new SortMountains().go();
    }
    public void go(){
        mtn.add(new Mountain("Logs", 142));
        mtn.add(new Mountain("Elbert", 1));
        mtn.add(new Mountain("Maroon", 15));
        mtn.add(new Mountain("Aogs", 1425));
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("by name:"+mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("by height:"+mtn);
    }
}

class Mountain{
    public String name;
    public Integer height;
    public Mountain(String n, int h){
        name = n;
        height = h;
    }
    public String toString(){
        return name;
    }
}
